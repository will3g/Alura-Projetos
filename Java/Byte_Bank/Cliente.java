package bytebank;

public class Cliente implements InterfaceClienteCadastro {

    private String nome, cpf, profissao;
    private int idade;
    private static int totalDeClientes = 0;
    // private boolean maiorDeIdade, impressaoAutomatica;

    private EnderecoCliente enderecoResidencial;
    private EnderecoTrabalho enderecoTrabalho;

    public Cliente() {
        this.nome = "---";
        //this.cpf = "---";
        this.profissao = "---Prof";
        this.idade = 00;

        // this.maiorDeIdade = false;
        // this.impressaoAutomatica = false;
        
        
        /*  if(this.impressaoAutomatica==true){ //Impressao automática conta universitária
         System.out.println("Você só tem opção para a conta universitária."
         + "\nVá em uma agência ByteBank para entregar os documentos necessários."
         + "\nEnviaremos as informações necessárias para seu email,"
         + "equipe ByteBnak agradece sua preferência.");
         } */
    }

//------------------ Link classe EnderecoTrabalho -------------------------
//-------------------------------------------------------------------------
    public EnderecoTrabalho getEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public void setEnderecoTrabalho(EnderecoTrabalho enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }

//------------------ Link classe EnderecoCliente --------------------------
//-------------------------------------------------------------------------   
    public EnderecoCliente getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(EnderecoCliente enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

//------------------------Nome do titular----------------------------------
//-------------------------------------------------------------------------    
    @Override
    public void titularNome() {

    }

    public String getNome() {
        return "Nome cliente: " + nome;
    }

    public void setNome(String nome) {
        //if (this.maiorDeIdade == true) {
        this.nome = nome;
        //} else {
        //this.impressaoAutomatica = true; //Impressao automática conta universitária
        //}
    }

//------------------------CPF do titular---------------------------------- 
//------------------------------------------------------------------------     
    @Override
    public void cpfTitular() {

    }

    public String getCpf() {
        return "CPF: " + this.cpf;
    }

    public void setCpf(String cpf) {
        // if (this.maiorDeIdade == true) {
        this.cpf = cpf;
        // } else {
        //    this.impressaoAutomatica = true; //Impressao automática conta universitária
        // }
    }

//------------------------Idade do titular---------------------------------
//-------------------------------------------------------------------------     
    @Override
    public void idadeTitular() {
    }

    public int getIdade() {
        //System.out.println("Idade: " + this.idade);
        return idade;
    }

    public void setIdade(int idade) {
        //if (idade > 18) {
        //Cliente.totalDeClientes++;
        //this.maiorDeIdade = true; //É maior de idade!
        this.idade = idade;
        //} else {
        //this.impressaoAutomatica = true; //Impressao automática conta universitária
        //}
    }

//---------------------Profissao do titular--------------------------------
//------------------------------------------------------------------------- 
    @Override
    public void profissaoTitular() {
    }

    public String getProfissao() {
        //System.out.println("Profissão: " + this.profissao);
        return "Profissão: "+profissao;
    }

    public void setProfissao(String profissao) {
        //if (this.maiorDeIdade == true) {
        this.profissao = profissao;
        //} else {
        //this.impressaoAutomatica = true; //Impressao automática conta universitária
        //}
    }

//------------------------------------------------------------------------- 
//-------------------------------------------------------------------------    
}
