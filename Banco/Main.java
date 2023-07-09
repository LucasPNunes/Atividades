import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Conta conta1 = new Conta("Lucas", "Casa do Lucas", "11122233344", 34050, 123);
		Conta conta2 = new Conta("Pedro", "Casa do Pedro", "22233344411", 32222, 345);
		Cartao cartao1 = new Cartao(2000, 3101, conta1, null, null);
		Scanner scan = new Scanner(System.in);
		boolean rodando = true;
		
		while(rodando == true){
	        
	    System.out.printf("\n\tMENU");
		System.out.printf("\n1 - Informacoes do cliente");
		System.out.printf("\n2 - Informacoes do cartão");
		System.out.printf("\n3 - Informacoes da conta");
		System.out.printf("\n4 - Trocar senha do cartao");
		System.out.printf("\n5 - Usar cartao");
		System.out.printf("\n6 - Sacar");
		System.out.printf("\n7 - Depositar");
		System.out.printf("\n8 - Transferir");
		System.out.printf("\n9 - Sair");
		
	    System.out.printf("\nDigite a opcao desejada: ");
	    int opcao = scan.nextInt();
	    double valor;
		switch(opcao){
		    case 1:
		        System.out.println("Nome: " + conta1.getDono().getNome());
		        System.out.println("Endereco: " + conta1.getDono().getEndereco());
		        System.out.println("CPF: " + conta1.getDono().getCpf());
		        break; 
		        
		    case 2:
		        System.out.println("Nome do cliente: " + cartao1.getConta().getDono().getNome());
		        System.out.println("Saldo do cartão: R$" + cartao1.getSaldo());
		        System.out.println("Numero da conta associada: " + cartao1.getConta().getNumero());
		        break;
		        
		    case 3: 
		        System.out.println("Nome do cliente: " + conta1.getDono().getNome());
		        System.out.println("Numero da conta: " + conta1.getNumero());
		        System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		        break;
		        
		    case 4:
		        System.out.println("Digite a senha antiga: ");
                int senhaAntiga = scan.nextInt();
		        cartao1.alterarSenha(senhaAntiga);
		        break;
		        
		    case 5: 
		        System.out.println("Digite o valor que deseja pagar: ");
		        valor = scan.nextDouble();
		        System.out.println("Digite a senha do cartão: ");
		        int senhaDigitada = scan.nextInt();
		        if(senhaDigitada == cartao1.getSenha()){
		            cartao1.pagar(valor);
		        }else{
		            System.out.println("Senha incorreta");
		        }
		        break;
		    case 6:
		        System.out.println("Digite o valor que deseja sacar: ");
		        valor = scan.nextDouble();
		        conta1.sacar(conta1.getSaldo() - valor);
		        System.out.println("Voce sacou R$" + valor);
		        break;
		        
		    case 7:
		        System.out.println("Digite o valor que deseja depositar: ");
		        valor = scan.nextDouble();
		        conta1.sacar(conta1.getSaldo() + valor);
		        System.out.println("Voce depositou R$" + valor);
		        break;
		        
		    case 8: 
		        System.out.println("Digite o valor a ser transferido:");
		        valor = scan.nextInt();
		        conta1.transfere(conta2, valor);
		        break;
		        
		    case 9:
		        System.out.println("Volte sempre :)");
		        rodando = false;
		        break;

		    default:
		        System.out.printf("Opcao invalida");
		        break;
	        }
        }
    }
}