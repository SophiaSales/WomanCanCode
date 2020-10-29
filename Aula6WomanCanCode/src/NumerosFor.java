import java.util.Scanner;
public class NumerosFor {
  public static void  main (String[]args) {
	  final int Numero_a_ler =3;
	  @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	  int minimo = Integer.MAX_VALUE;
	  int maximo = Integer.MIN_VALUE;
	  
	  for (int i=0;i < Numero_a_ler; i++) {
		  System.out.print("Primeiro numero: ");
		  int num =sc.nextInt();
		  if(num<minimo) {
			  minimo = num;
		  }
		  if(num>maximo) {
			  maximo = num;
		  }
	  
	  }
	  System.out.println("O menor numero é: " +minimo);
	  System.out.println("O maior numero é: " +maximo);
  } 
}
