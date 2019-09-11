package bytebank;

public class ContaCorrente implements InterfaceCorrente {

    //boolean ok = true;
    //boolean contaAtiva;

    private double saldo = 100, saque, transfere, deposito;

    private int agencia;
    private static int totalContasCorrente = 0;

    private Cliente cpfTitular;

    //private String titular;
    private String numeroConta;

//----------------------------------------------------------------------------
//------------------------ Construtor conta default---------------------------
   public ContaCorrente() {
        ContaCorrente.totalContasCorrente++;
        this.agencia = 0001;
        this.numeroConta = "0000000000000000";
        this.saldo = 100;
        this.saque = 0;
      //  this.contaAtiva = false;

    }

//----------------------------------------------------------------------------
//----------------------------- Total de contas ------------------------------
    public static int getTotalContasCorrente() {
        System.out.print("\nO total de contas corrente é ");
        return ContaCorrente.totalContasCorrente;
    }

//----------------------------------------------------------------------------
//--------------Método (Saque / Depósito / Transferencia)--------------------- 
    @Override
    public void saque() {
        if (this.saldo > saque) {
            this.saldo -= saque;
            System.out.println("Seu novo saldo é R$ " + this.saldo);
        } else {
            System.out.println("Saldo insulficiente de R$ " + this.saldo);
        }
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaldo() {
        System.out.println("Saldo atual de R$ " + this.saldo);
        return saldo;
    }

//----------------------------------------------------------------------------    
    @Override
    public void transfereDinheiro() //Começo transferencia
    {
        if (this.saldo > transfere) {
            this.saldo -= transfere;
        }
    }

    public void setTransfere(double transfere, ContaCorrente destino) //Final transferencia
    {
        if (this.saldo > transfere) {
            this.transfere = transfere;
            System.out.println("Transferencia de R$ " + transfere + " efetuada com sucesso!");
            destino.setDeposito(transfere);
        } else {
            System.out.println("Saldo insuficiente para transferencia.");
            System.out.println("Saldo atual de " + this.saldo);
        }
    }

//----------------------------------------------------------------------------
    @Override
    public void depositoByte() //Começo depósito
    {
        this.saldo += deposito;
    }

    public double getDeposito() {
        System.out.println("Deposito de R$ " + deposito);
        return deposito;
    }

    public void setDeposito(double deposito) //Final depósito
    {
        this.deposito = deposito;
    }

//----------------------------------------------------------------------------
//------------------------ Numero da conta -----------------------------------
    @Override
    public void numeroConta() //Começo numeroConta
    {
        //System.out.println("Número conta: " + this.numeroConta);
    }

    public String getNumeroConta() {
        return "Número de conta do tiular: " + numeroConta;
    }

    public void setNumeroConta(String numeroConta) //Final numeroConta
    {
        this.numeroConta = numeroConta;
    }

//----------------------------------------------------------------------------
//------------------------ Numero da agência ---------------------------------    
    @Override
    public void agenciaBank() //Começo agencia
    {
        //System.out.println("Agência do titular: " + this.agencia);
    }

    public int getAgencia() {
        System.out.println("Agência: " + this.agencia);
        return agencia; //Retorna Int
    }

    public void setAgencia(int agencia) //Final agencia
    {
        if (agencia <= 0) {
            System.out.println("Agência inválida.");
            return;
        }
        this.agencia = agencia;
    }

//----------------------------------------------------------------------------
//---------------------- Link com a classe cliente----------------------------
    public Cliente getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(Cliente cpfTitular) {
        this.cpfTitular = cpfTitular;
        
    }
}
