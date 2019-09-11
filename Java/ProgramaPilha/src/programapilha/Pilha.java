package programapilha;

public class Pilha implements InterfaceDaPilha {

    public Pilha() {
        this.carga = 100;
        this.potencia = 5;
        this.tamanho = 4;
        this.nome = "Duraccel";
    }

    private double carga, potencia;
    private String nome;
    private int tamanho;

    @Override
    public void nomeDaPilha() {
        System.out.println("Nome da pilha: " + this.nome);
    }

    @Override
    public void cargaDaPilha() {
        System.out.println("\nCarga da pilha: " + this.carga + "%");
    }

    @Override
    public void tamanhoDaPilha() {
        System.out.println("Tamanho da pilha: " + this.tamanho);
    }

    @Override
    public void potenciaDaPilha() {
        System.out.println("Potência da pilha: " + this.potencia + "W");
    }

    private double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    private double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
