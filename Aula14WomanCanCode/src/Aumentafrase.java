
public class Aumentafrase {
	@SuppressWarnings("null")
	public static void main (String[]args) {
		String frase = null;
		String novaFrase = null;
		try {
			novaFrase = frase.toUpperCase(); 
		}
		catch(NullPointerException e) {
			System.out.println("O frase inicial esta nula ,para solucionar tal o problema ,foi atribuido um valor default.");
			frase = "Hello World";
			
			e.printStackTrace();
		}
		finally {
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
	} 

}
