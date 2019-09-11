package bytebank;

public class EnderecoCliente {

    private String rua,
            complemento,
            bairro,
            cidade,
            estado;
    private int cep, numero;

    public EnderecoCliente() {
        this.rua = "---";
        this.complemento = "---";
        this.bairro = "---";
        this.cidade = "---";
        this.estado = "---";
        this.cep = 00000000;
        this.numero = 000;
    }
    
//------------------------------------------------------------------------- 
//---- Setters Rua, complemento, bairro, cidade, estado, cep, numero ------ 

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
//------------------------------------------------------------------------- 
//---- Getters Rua, complemento, bairro, cidade, estado, cep, numero ------ 

    public String getRua() {
        return rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return "Estado cliente: "+estado;
    }

    public int getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

}
