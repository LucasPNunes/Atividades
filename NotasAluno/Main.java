import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    ArrayList<Aluno> turma = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);

	    boolean rodando = true;
	    
	    while(rodando == true){
	        System.out.printf("\n\n\tMENU\n");
    		System.out.println("1 - Exibir alunos.");
    		System.out.println("2 - Cadastrar aluno.");
    		System.out.println("3 - Digitar nota 1º Bimestre.");
    		System.out.println("4 - Digitar a nota do 2º bimestre.");
    		System.out.println("5 - Fechar notas. (calcular a nota final).");
    		System.out.println("6 - Exibir media final da turma.");
    		System.out.println("7 - Exibir aluno com maior nota.");
    		System.out.println("8 - Exibir aluno com menor nota.");
    		System.out.println("9 - Exibir alunos acima da media.");
    		System.out.println("10 - Sair.");
    		int opcao = scan.nextInt();
	        switch(opcao){
	            case 1: 
	                for (Aluno aluno: turma){
                        System.out.println(aluno.getMatricula());
                    }
	                break;
	            case 2:
	                if(turma.size()<=5){
    	                System.out.println("Digite a matricula do aluno: ");
    	                long matricula = scan.nextLong();
    	                turma.add(new Aluno(matricula)); 
	                    }else{
	                        break;
	                    }
	                break;
	                
	            case 3: 
	                System.out.println("Digite a matricula do aluno: ");
	                long matricula = scan.nextLong();
	                System.out.println("Digite a nota do primeiro bimestre");
    	            double nota1 = scan.nextDouble();
    	            for(Aluno aluno : turma){
    	                if(matricula == aluno.getMatricula()){
    	                    aluno.setNota1b(nota1);
    	                    }   
    	                }
	                break;
	            case 4: 
	                System.out.println("Digite a matricula do aluno: ");
	                matricula = scan.nextLong();
	                System.out.println("Digite a nota do segundo bimestre");
    	            double nota2 = scan.nextDouble();
    	            for(Aluno aluno : turma){
    	                if(matricula == aluno.getMatricula()){
    	                    aluno.setNota2b(nota2);
    	                }
    	            }
	                break;
	            case 5: 
	                for(Aluno aluno : turma){
	                    aluno.fecharNotas();
	                }
	                System.out.println("Notas fechadas");
	                
	                break;
	            case 6:
	                double soma = 0;
	                for(Aluno aluno : turma){
	                    soma += aluno.getNotaFinal();
	                }
	                double media = soma / turma.size();

                    System.out.println("A média da turma é: " + media);
	                break;
	                
	            case 7:
	                long matMaior = 0;
	                double maiorNota = -1;
	                for(Aluno aluno : turma){
	                    if (aluno.getNotaFinal() > maiorNota){
	                        maiorNota = aluno.getNotaFinal();
	                        matMaior = aluno.getMatricula();
	                    }
	                }    
	                System.out.println("A maior nota foi: " + maiorNota + " do aluno " + matMaior);
	                
	                break;
	            case 8: 
	                long matMenor = 0;
	                double menorNota = 11;
	                for(Aluno aluno : turma){
	                    if (aluno.getNotaFinal() < menorNota){
	                        menorNota = aluno.getNotaFinal();
	                        matMenor = aluno.getMatricula();
	                    }
	                }
	                System.out.println("A menor nota foi: " + menorNota + " do aluno " + matMenor);
	                 
	                break;
	            case 9:
	                System.out.println("Alunos acima da média: ");
	                for(Aluno aluno : turma){
	                    if (aluno.getNotaFinal() >= 7.0){
	                        System.out.println(aluno.getMatricula());
	                    }
	                }
	                break;
	                
	            case 10:
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

    

