package exlivroarraylistum;

import java.util.ArrayList;

public class ExLivroArrayListUm {

    public static void main(String[] args) {

        ArrayList<Float> tamanhoDosPeixes = new ArrayList<>();
        tamanhoDosPeixes.add(10f);
        tamanhoDosPeixes.add(15.5f);
        tamanhoDosPeixes.add(18f);
        tamanhoDosPeixes.add(29.5f);
        tamanhoDosPeixes.add(45.5f);

        for (float tamanhos : tamanhoDosPeixes) {
            if (tamanhos > 28) {    
                System.out.print(tamanhos + "  ");   
            }
        }
    }
}
