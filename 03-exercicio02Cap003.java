package algaworks;
import java.util.Scanner;

public class exercicio02Cap03 {

	public static void main(String [] args) {
		
		System.out.println("Please enter your name and surname: ");
		System.out.println("Name: ");
		Scanner entering = new Scanner(System.in);
		
		String nome = entering.nextLine();
		
		System.out.println("Surname: ");
		String nomeTwo =  entering.nextLine();
		
		
		System.out.println("Hello " + nome + " " + nomeTwo + ", How may I assist you with Today?");
		
		entering.close();
	}
}
