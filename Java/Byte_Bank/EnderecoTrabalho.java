package bytebank;

public class EnderecoTrabalho extends EnderecoCliente{

    //Tenho que usar endereço de tranalho e etc...
    
    private long cnpj;
    private String situacaoProfissional;

    public EnderecoTrabalho() {
        this.cnpj = 00000000000000;
        this.situacaoProfissional = "---Situa"; 
    }

//------------------------------------------------------------------------- 
//---------------- Setters CNPJ / Situação profissional -------------------     
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public void setSituacaoProfissional(String situacaoProfissional) {
        this.situacaoProfissional = situacaoProfissional;
    }

//------------------------------------------------------------------------- 
//---------------- Getters CNPJ / Situação profissional -------------------    
    public long getCnpj() {
        return cnpj;
    }

    public String getSituacaoProfissional() {
        return "Situação profissional: "+situacaoProfissional;
    }
}
