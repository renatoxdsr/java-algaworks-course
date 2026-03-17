package algaworks;

public class TipoLogico {

	public static void main(String[] args) {
		// Boolean variable - true
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		// Boolean variable - false
		Boolean variavelFalsa = false;
		
		System.out.println("-------------------------");
		
		Integer age = 17;
		
		Boolean canGetDriveLicense = age >=18;
		//	System.out.println("Are you allowed to get your Drive License? " + canGetDriveLicense);
		
		if(canGetDriveLicense) {
			System.out.println("Yes, this person is allowed to get Drive license");
		}
		else {
			System.out.println("You are not allowed to get Drive license yet, Hold on tight ");
		}
		

		
		
		
	}
}
