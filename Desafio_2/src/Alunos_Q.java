import java.util.Scanner;
public class Alunos_Q {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		// escrevr vetor	
		
		int cont, tr = 0, te = 0, ta = 0;
		cont = 1;
		while (cont < 5) {
			cont++;
			
		String disciplina, nome;
		double Prova, Projeto, Lista_de_Exercícios, media;
		System.out.println("Digite a Disciplina: ");
		disciplina = sn.nextLine();
		System.out.println("Digite o Nome do Aluno: ");
		nome  = sn.nextLine();
		System.out.println();
		System.out.println("Digite a Nota da Prova: ");
		Prova = sn.nextDouble();
		System.out.println("Digite a Nota do Projeto: ");
		Projeto = sn.nextDouble();
		System.out.println("Digite a Nota das Listas de Exercício: ");
		Lista_de_Exercícios = sn.nextDouble();
		media = (Prova*(5) ) + (Projeto*(3)) + (Lista_de_Exercícios*(2))/3;
		System.out.println("Média: " + media);
		System.out.println();
	    if (media >= 80) {
			ta++;
		    System.out.println("Aprovado.");
		} else if(media <= 70.99 && media > 50 ) {
			te++;	
		    System.out.println(" Realizar avaliação final");    
		}else { 
		    System.out.println("Reprovado");
		
			tr++;
		}
			 System.out.println();
			
	    System.out.println("Aprovados: " + ta);
		System.out.println("Realizar avaliação final: " + te );
		System.out.println("Reprovados: " + tr);
		System.out.println();
		break;
		}
	}

}


