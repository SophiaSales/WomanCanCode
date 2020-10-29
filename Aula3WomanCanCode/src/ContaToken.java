import java.util.Scanner;

public class ContaToken {
	public static void main (String[]args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um telefone: ");
	    while (sc.hasNext() && i<6) {
	    	i++;
	    	System.out.println("Telefone: "+sc.nextInt());
	    }
	    sc.close();
	    System.exit(0);
	}
	
}
