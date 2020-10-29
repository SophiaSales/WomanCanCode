import java.util.Scanner;
public class Tabuda {
	public static void main (String[]args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um numero pra forma a Tabuada: ");
		
		int num = ler.nextInt();
		
		if(num >=0) {
			for(int i=0; i<=10;i++) {
				System.out.println(num + "x" + i + "=" +num*i);
			}
			
		}
		else {
			System.out.println("Numero invalido / tabuada não existe ");
		}
	}
	

}
