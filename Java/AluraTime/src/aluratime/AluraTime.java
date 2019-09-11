package aluratime;

import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.ArrayList;

public class AluraTime {

    public static void main(String[] args) {
        
        float tamanho=28, peixeUm = 18f, peixeDois = 15.5f, peixeTres = 18f, 
                peixeQuatro = 29.5f, peixeCinco = 45.5f;
        
        ArrayList<Float> peixeLarguraLista = new ArrayList();
        peixeLarguraLista.add(18f);
        peixeLarguraLista.add(15.5f);
        peixeLarguraLista.add(35f);
        peixeLarguraLista.add(29.5f);
        peixeLarguraLista.add(45.5f);
      
        volta: for(Float peixes:peixeLarguraLista){
              if(peixes>28f){
                  System.out.println(peixes);
                
              }    
        }
        
       /* String compare = "S1";
        Random aleatorio = new Random();
        
        for(int i=0; i<4; ++i){
            int entrada = aleatorio.nextInt(6);
            switch(entrada){
                case 1: System.out.println("Entrou no um = +1 ponto"); break;
                case 2: System.out.println("Entrou no dois = +2 pontos"); break;
                case 3: System.out.println("Entrou no três = +3 pontos"); break;
                case 4: System.out.println("Entrou no quatro = +4 pontos"); break;
                case 5: if(compare.equals("S1")){System.out.println("É igual!"); }else{ System.out.println("É diferente!"); } break;
                default: System.out.println("Errou, não ganhou nenhum ponto."); break;
            }     
        }*/
        
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        System.out.println("\nData: "+ld);    //Saída: Data: 2019-03-21
        System.out.println("Horário: "+lt); //Saída: Horário: 20:20:46.946
        
        LocalDateTime ldt2 = ld.atTime(lt);
        LocalDateTime ldt3 = lt.atDate(ld); 
        System.out.println("\nldt2 -> "+ldt2); //Saída: ldt2 -> 2019-03-21T20:20:46.946
        System.out.println("ldt3 -> "+ldt3); //Saida: ldt3 -> 2019-03-21T20:20:46.946
        
        Date d = new Date();
        d.toInstant();
        System.out.println("\nComo a máquina lê: "+d); //Saída:    Thu Mar 21 20:20:46 BRT 2019
        //Instant i = d.toInstant();  -> retorna um objeto  
        //Esse objeto representa os milisegundos desde o ano 1970
        //Instant = long;
        //Fazendo de outra maneira
        Instant i = d.toInstant();
        LocalDateTime ldt4 = LocalDateTime.ofInstant(i, ZoneId.of("Japan"));
        System.out.println("ldt4= "+ldt4);
        //Fazendo de outra maneira
        //ou
        LocalDateTime ldt5 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());//pega o fuso horário da máquina virtual
        System.out.println("ldt5= "+ldt5);
        //calendar
        Calendar c = Calendar.getInstance();
        Instant inta = c.toInstant();
        LocalDateTime ldt6 = LocalDateTime.ofInstant(inta, ZoneId.systemDefault());//pega o fuso horário da máquina virtual
        
        System.out.println("ldt6= "+ldt6);
        //Date from
        Instant i1 = ldt.toInstant(ZoneOffset.UTC);
        Date d2 = Date.from(i1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);
        
        System.out.println("Date from: "+d2);
        //Somando segundos
        Instant tim = Instant.now();
        Duration secSoma = Duration.ofSeconds(20);
        Instant somaTempo = tim.plus(secSoma);
        
        System.out.println("Instant tim segundos = "+tim);
        System.out.println("Instant tim + 20 segundos = "+somaTempo);
        
        //Comparando dois horários e mostrando sua diferença
        Instant m1 = Instant.EPOCH; //Aqui ele vai pegar desde de 1970
        Instant m2 = Instant.now(); //Aqui ele pega o momento atual
        Instant m3 = Instant.now();
        System.out.println("---> "+m2); //Saída: ---> 2019-03-22T00:48:50.989Z
        
        long segundos = Duration.between(m1, m2).getSeconds();
        System.out.println("Segundos comparação/diferença tempo: "+segundos);
        
        long horas = Duration.between(m2, m3).toHours();
        System.out.println("Horas: "+horas);
               
        //Usando decisões com if-else
  
        LocalDate meuAniversario = LocalDate.of(1997, 12, 26);
        LocalDate aniversarioAno = LocalDate.of(2019, 12, 26);
        LocalDate dataAtual = LocalDate.now();
        
        if(segundos!=horas){
            System.out.println("Entrou");
        } 
        
        if(dataAtual==aniversarioAno){ //se dataAtual for igual a meuAniversario
            //Aqui mostra a idade do usuário
            System.out.println("Atualmente você tem "+ChronoUnit.YEARS.between(aniversarioAno, dataAtual)+" anos."); 
            System.out.println("Feliz aniversário!");   
        }else{//caso o contrário
              //Dias restantes para o próximo aniversário
            System.out.println("Falta "+ChronoUnit.DAYS.between(dataAtual, aniversarioAno)+" dias para o seu aniversário");
        }
           
        //Usando period -IMPORTANTE E BEM UTIL
        Period tempoDeVida = Period.between(meuAniversario, dataAtual);
        System.out.println("\nAqui ele faz o cálculo com base no tempo AAAA/12/31");
        System.out.println("Anos: "+tempoDeVida.getYears());
        System.out.println("Mês: "+tempoDeVida.getMonths());
        System.out.println("Dias: "+tempoDeVida.getDays());
    } 
}
