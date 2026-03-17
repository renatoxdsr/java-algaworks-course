package algaworks;

import java.util.Scanner;

public class exercicio05Cap03 {
	
	static final Integer MINIMUM_SCORE_TO_PASS_EXAM = 70;
	
	public static void main(String[] args) {
		
		System.out.print("What was your exam score: ");
		
		Scanner scanner = new Scanner(System.in);
		Double scoreTaken = scanner.nextDouble();
		
		//final Double minimumScore = 70.0;
		Boolean passedEx = scoreTaken >= MINIMUM_SCORE_TO_PASS_EXAM;
		
		if(passedEx) {
			System.out.println("Congratulations, you have passed the exam!");
		}else {
			System.out.println("Unfortunately you haven't passed it, hold on tight");
		}
	}
	
}
