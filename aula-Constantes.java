package algaworks;

import java.util.Scanner;

public class constantes {
	
	// Create a Static constante
	//Static Constante is a standard way to use in Java
	// static final Integer AGE_TO_GET_DL = 18;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Create a Variable - Constante
		// improve my algoritms understanding 
		// Declare a Integer variable
		//--> Integer minimumAge = 18;
		// this is not a constante yet
		//Constante is fixed and cannot be changed throughout the code 
		// to create a Constante you need to enter final
		final Integer minimumAge = 18;
		
		System.out.println("Age: ");
		
		Integer age = scanner.nextInt();
		
		Boolean canGetDl = age >= minimumAge;
		
		if(canGetDl) {
			System.out.println("You are entitled to get the Drive license");
		} else {
			System.out.println("You are not entitled");
		}
		
	}
}
