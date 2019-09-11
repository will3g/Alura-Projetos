from datetime import date

class Conta:

    def __init__(self, numero, titular, saldo, limite):
        self.__agencia = 123
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite
        self.__data = date.today()
        print(self.dataCriacaoConta)

    @staticmethod
    def codigo_banco():
        return "001"

    def extrato(self):
        print("O seu saldo é {} com limite de {} reais".format(self.saldo, self.limite))

    def __verifica_saque(self, pedido_saque):
        saldo_total = self.__saldo + self.__limite
        return pedido_saque <= saldo_total

    def saca(self, valor):
        if(valor > 0):
            if(self.__verifica_saque(valor)):
                self.__saldo -= valor
            else:
                print("O valor de {} reais exede o limite.".format(valor))
        else:
            print("Valor tem que ser maior que zero!")

    def deposita(self, valor):
        if(valor > 0):
            self.__saldo += valor
            print("Valor de {} depositado com sucesso!".format(valor))
        else:
            print("Valor para deposito tem que ser maior que zero!")

    def transfere(self, conta_destino, valor):
        self.saca(valor)
        conta_destino.deposita(valor)

    @property
    def dataCriacaoConta(self):
        self.__data_em_texto = self.__data.strftime('%d/%m/%y')
        return "Conta criada em {} titular {}".format(self.__data_em_texto, self.titular)

    @property
    def titular(self):
        return self.__titular.title()

    @property
    def saldo(self):
        return self.__saldo

    @property
    def limite(self):
        return self.__limite

    @limite.setter
    def limite(self, novo_limite):
        self.__limite = novo_limite

    @staticmethod
    def codigos_bancos():
        return {'BB': '001', 'Caixa': '104', 'Bradesco': '237'}