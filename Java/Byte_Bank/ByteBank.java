package bytebank;
//import java.util.ArrayList;
//import java.util.Scanner;
public class ByteBank {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        
        Cliente cliente = new Cliente(); 
        EnderecoCliente enderecoCliente = new EnderecoCliente();
        EnderecoTrabalho enderecoClienteTrabalho = new EnderecoTrabalho();

        //Link das classes
        contaCorrente.setCpfTitular(cliente);
        cliente.setEnderecoResidencial(enderecoCliente);
        cliente.setEnderecoTrabalho(enderecoClienteTrabalho);
        
        
/*
        cliente.getEnderecoResidencial().setBairro("Guaianases");
        cliente.getEnderecoTrabalho().setBairro("Consolação");

        System.out.println("Bairro residencial: " + cliente.getEnderecoResidencial().getBairro());
        System.out.println("Bairro trabalho: " + cliente.getEnderecoTrabalho().getBairro());
        System.out.println(ContaCorrente.getTotalContasCorrente());
*/

        
        //Setando a variável CPF da classe cliente
        // cliente.setCpf("460"); 
        /*//Passando pela classe ContaCorrente, pegando sua referência de memória e setando o nome
         contaCorrente.getCpfTitular().setNome("William.");
         contaCorrente.getCpfTitular().setProfissao("Desenvolvedor.");
         cliente.getEnderecoResidencial().setEstado("São Paulo.");
         cliente.getEnderecoTrabalho().setSituacaoProfissional("Registrado CLT.");
       
       
       
         System.out.println(contaCorrente.getCpfTitular().getNome());
         System.out.println(contaCorrente.getCpfTitular().getProfissao());
         System.out.println(cliente.getEnderecoResidencial().getEstado());
         System.out.println(cliente.getEnderecoTrabalho().getSituacaoProfissional());
        
         System.out.println("\n\n\n\n\n\n\nEndereço classe contaCorrente está apontando para a classe cliente? "+contaCorrente.getCpfTitular().equals(cliente));
         System.out.println("\nEndereço classe contaCorrente: "+contaCorrente);
         System.out.println("Endereço classe cliente: "+cliente);
         System.out.println("Endereço classe contaCorrente: "+contaCorrente.getCpfTitular()+" <- endereço classe cliente");*/
        /*
         ContaCorrente cC2 = new ContaCorrente();
 
         System.out.print("\nDigite o número da agência: ");
         int agencia = teclado.nextInt();
         cC.setAgencia(agencia);

         System.out.print("\nDigite o número da conta com 16 digitos para cadastrar: ");
         String numConta = teclado.next();
         cC.setNumeroConta(numConta);

         System.out.print("\nDigite o nome para cadastro: ");
         String nome = teclado.next();
         cC.setTitular(nome);

         System.out.print("\nDigite o valor para saque: ");
         double valor = teclado.nextDouble();
         cC.setSaque(valor); //Esse set é o "assistente" que faz o serviço para o saque
         cC.saque();         //Chamada do método saque (método que tem o algoritmo)

         System.out.println("\nTransferencia de crédito");
         System.out.print("Digite o valor de transferencia: ");
         double transfere = teclado.nextDouble();      
         cC.setTransfere(transfere, cC2); //Assistente de execução
         cC.transfereDinheiro();          //Chamada de método (ou algoritmo)
        
         System.out.println("\nConta de joão");
         cC.getNumeroConta();
         cC.getAgencia();
         cC.getTitular();
         cC.getSaldo();
        
         System.out.println("\nNa conta de Maria");
         cC2.depositoByte(); //Chamada do algoritmo para validação/depósito da trasferencia
         cC2.getSaldo();
      
         ----*/
    }

}
