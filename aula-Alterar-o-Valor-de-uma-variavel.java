package algaworks;

import java.util.Scanner;

public class alterarOValorDeUmaVariavel {
	public static void main(String[] args) {
		// Alterar o Valor de uma Variavel
		
		Scanner scanner = new Scanner(System.in);
		
		//remove  println - in this way the value will be entering next to the message
		// println lets you entering the value in the next line
		System.out.print("Type the product price: ");
		
		//declare another variable 
		Double productPrice = scanner.nextDouble();
		
		//declare another variable
		System.out.print("Type the payment type: (1 - In cash / 2 - Credit Card) ");
		Integer paymentType = scanner.nextInt();
		
		//use Boolean to know if it's true
		// use .equals()
		Boolean inCashPayment = paymentType.equals(1);
		
		// create variable for fee
		Double fees = 0.0;
		if(inCashPayment) {
			
		} else {
			// add fees in case you pay with credit card
			// fee is 10%
			// variable type you just declare when you are creating the variable. no need to enter type again
			fees = 10.0;
			
		}
		
		// rule of 3 
		Double feesIncreasing = productPrice * fees / 100;
		Double totalValue = feesIncreasing + productPrice;
		System.out.println("Total Value: " + totalValue);
		scanner.close();
	}

}
