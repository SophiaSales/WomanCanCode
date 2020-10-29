import java.util.Scanner;

public class Leitor {
	@SuppressWarnings("resource")
	public static void main (String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual seu nome: ");
		String nome = leitor.next();
		System.out.println("Ola " + nome + " Qual sua idade?:");
		String idade = leitor.next();
		System.out.println("Sua idade é " + idade + " anos " + nome);
		
		
	}
	
}
