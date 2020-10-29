import java.util.Scanner;

public class LinguagemJava {
	public static void main (String []args) {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner (System.in);
		System.out.println("Escolha uma linguagem : Java ou C");
		String nome = leitor.next();
		
		switch (nome) {
		case "Java":
			System.out.println("Melhor escolha ! Esta limguagem é orientada a objetos");
			break;
		case "C":
			System.out.println("Esta linguagem é estrutura");
			break;
			default:
				System.out.println("Liguagem desconhecida");
		
		}
	}
  
}
