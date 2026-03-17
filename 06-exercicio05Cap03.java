#O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.

#Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou não passou.

#Transfome o valor 70 em Constante

package algaworks;

import java.util.Scanner;

public class exercicio05Cap03 {
	
	public static void main(String[] args) {
		
		System.out.print("What was your exam score: ");
		
		Scanner scanner = new Scanner(System.in);
		Double scoreTaken = scanner.nextDouble();
		
		final Double minimumScore = 70.0;
		Boolean passedEx = scoreTaken >= minimumScore;
		
		if(passedEx) {
			System.out.println("Congratulations, you have passed the exam!");
		}else {
			System.out.println("Unfortunately you haven't passed it, hold on tight");
		}
	}
	
}
