package algaworks;

import java.util.Scanner;

public class exercicioDois {
	public static void main(String [] args) {
	
		
		System.out.println("Let's calculate your IMC. Please enter your Weight: ");
		Scanner entradaUm = new Scanner(System.in);
		double peso = entradaUm.nextDouble();
		
		System.out.println("Please enter your Height: ");
		Scanner entradaDois = new Scanner(System.in);
		double altura = entradaDois.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Your current IMC is: " + imc);
		
	}

	
}
