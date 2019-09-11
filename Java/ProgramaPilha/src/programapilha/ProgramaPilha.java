package programapilha;

import java.util.Scanner;

public class ProgramaPilha {

    static Scanner teclado = new Scanner(System.in);
    static boolean retorno = true;

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        System.out.println("Fabricação pilha");

        pilha.cargaDaPilha();
        pilha.potenciaDaPilha();
        pilha.nomeDaPilha();
        pilha.tamanhoDaPilha();

        try {
            System.out.print("\n\nDigite a carga da pilha: ");
            double carga = teclado.nextDouble();
            pilha.setCarga(carga);

            System.out.print("\nDigite a potência da pilha: ");
            double potencia = teclado.nextDouble();
            pilha.setPotencia(potencia);

            System.out.print("\nDigite o nome da pilha: ");
            String nome = teclado.next();
            pilha.setNome(nome);

            System.out.print("\nDigite o tamanho da pilha: ");
            int tamanho = teclado.nextInt();
            pilha.setTamanho(tamanho);

        } catch (Exception e) {
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nErro...\n");
        }

        pilha.cargaDaPilha();
        pilha.potenciaDaPilha();
        pilha.nomeDaPilha();
        pilha.tamanhoDaPilha();
    }
}
