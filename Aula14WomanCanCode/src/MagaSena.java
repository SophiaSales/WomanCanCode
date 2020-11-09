import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class MagaSena {
	@SuppressWarnings("resource")
	public void geraJogo() {
		Scanner leia;
		leia = new Scanner(System.in);
		int quantidadeNumeroNoJogo;
		int quantidadeJogo;
		int quantidadeMaxdeNumeronoJogo = 60;
		
		System.out.println("Quantos Numeros voce incluir no seu jogo?");
		quantidadeNumeroNoJogo = leia.nextInt();
		
		System.out.println("Quantos Jogos você gostaria de gerar?");
		quantidadeJogo = leia.nextInt();
		
		Random embaralhaNumero = new Random();
		int i = 0;
		while (i < quantidadeJogo) {
		  Set<Integer> generated = new LinkedHashSet<Integer>();
		  while (generated.size() < quantidadeNumeroNoJogo) 
		  {
		     Integer next = embaralhaNumero.nextInt(quantidadeMaxdeNumeronoJogo) + 1;
		     generated.add(next);
		  }
		  i++;
		  System.out.println("Jogo " + i + " " + generated.toString());
		}
		
		 
	} 


}
