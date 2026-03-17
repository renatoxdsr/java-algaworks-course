package algaworks;

import java.util.Scanner;


public class exercicioUmCap03 {

	public static void main(String [] args) {
		
		System.out.println("Calculator - Number powered of 2:");
		
		Scanner entradaUm = new Scanner(System.in);
		int numero = entradaUm.nextInt();
		
		int poweredOfTwo = numero * numero;
		
		System.out.println("The number " + numero + " powered by 2 is: " + poweredOfTwo);
		
		entradaUm.close();
		
	}
}
