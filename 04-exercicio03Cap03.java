package algaworks;
import java.util.Scanner;

public class exercicio03Cap03 {

	public static void main(String[] args) {
		
	
		System.out.println("Enter your score:");
		Scanner scanner = new Scanner(System.in);
		double scoreOne = scanner.nextInt();
		
		Boolean passou = scoreOne>= 70;
		if(passou) {
			System.out.println("You've reached the score");
		}
		else {
			System.out.println("I am afraid you haven't reached the minimum to pass!");
		}
	}
}
