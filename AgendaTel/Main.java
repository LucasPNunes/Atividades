import java.util.*;

public class Main
{
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scan = new Scanner(System.in);

        boolean rodando = true;

        while(rodando == true){
            System.out.printf("\n\n\tMENU\n");
            System.out.println("1 - Exibir contatos");
            System.out.println("2 - Inserir contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Tamanho da agenda");
            System.out.println("6 - Sair");

            int opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    agenda.exibir();
                    break;

                case 2:
                    scan.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite o ddi: ");
                    String ddi = scan.nextLine();
                    System.out.print("Digite o ddd: ");
                    String ddd = scan.nextLine();
                    System.out.print("Digite o numero: ");
                    String numero = scan.nextLine();

                    agenda.inserir(nome, new Contato(numero, ddd, ddi));
                    break;

                case 3:
                    scan.nextLine();
                    System.out.print("Digite o nome: ");
                    String busca = scan.nextLine();
                    System.out.println(agenda.buscarNumero(busca));
                    break;

                case 4:
                    System.out.println("Digite o nome:");
                    nome = scan.next();
                    agenda.remover(nome);
                    break;

                case 5:
                    agenda.tamanho();
                    break;

                case 6:
                    System.out.println("Saiu");
                    rodando = false;
                    break;

                default:
                    System.out.println("Erro");
                    break;

            }
        }
    }
}
