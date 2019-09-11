# ------------------------------- Herança Simples --------------------------------- #

class Funcionario: # Classe Mãe
    def __init__(self, nome):
        self._nome = nome

    def registra_horas(self, horas):
        print('Horas registradas...')

    def mostrar_tarefas(self):
        print('Fez muita coisa...')

class Caelum(Funcionario): # Classe filha
    def mostrar_tarefas(self):
        print('Fez muita coisa, Caelumer')

    def busca_cursos_do_mes(self, mes=None):
        print(f'Mostrando cursos - {mes}' if mes else 'Mostrando cursos desse mês')

class Alura(Funcionario): # Classe filha
    # def mostrar_tarefas(self):
    #     print('Fez muita coisa, Alurete!')

    def busca_perguntas_sem_resposta(self):
        print('Mostrando perguntas não respondidas do fórum')

class Hipster:
    def __str__(self):
        return f'Hipster {self._nome}'


# -------------------------------- Herança multipla ---------------------------------- #

class Junior(Alura): # Herança simples
    pass

class Pleno(Alura, Caelum): # Herança Multipla
    pass

class Senior(Alura, Caelum, Hipster): # Herança Multipla
    pass


# -------------------------------- Setando valores -------------------------------- #

jose = Junior('Jose') #Só herda de Alura
jose.busca_perguntas_sem_resposta()
jose.mostrar_tarefas()

luan = Pleno('Luan') #Herda de Alura e Caelum
luan.busca_perguntas_sem_resposta()
luan.busca_cursos_do_mes()
luan.mostrar_tarefas()

paulo = Senior('Paulo')
print(paulo)
8
#Basicamente, a herança múltipla funciona desta maneira, e muitos se perguntam o porquê de não existir herança
# múltipla em outras linguagens, e o motivo é que isso pode acabar ficando muito complexo. Neste exemplo,
# foi impresso "Fez muita coisa, Alurete!", porém, se a herança vem de Caelum e Alura, por que esta mensagem,
# e não "Fez muita coisa, Caelumer"?