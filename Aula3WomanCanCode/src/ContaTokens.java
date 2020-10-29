import java.util.Scanner;
public class ContaTokens {

	public void imprimiContaTokens(String textoDigitado) {
		int i =0;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext() &&i<5) {
			i++;
			
			System.out.println("Aqui esta seu numero novo: "+textoDigitado);
		}
		sc.close();
	}

	

}
