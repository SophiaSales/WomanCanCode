import java.util.Scanner;

public class NumerosIf {
 public static void main (String[]args) {
	 @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 int num;
	 int minimo = Integer.MAX_VALUE;
	 int maximo = Integer.MIN_VALUE;
	 
	 System.out.print("Primeiro numero: ");
	 num = sc.nextInt();
	 if(num<minimo) {
		 minimo = num;
	 }
	 if(num> maximo) {
		 maximo = num;
	 }
	 System.out.print("Seguendo numero: ");
	 num =sc.nextInt();
	 if(num<minimo) {
		 minimo =num;
	 }
	 if(num>maximo) {
		 maximo = num;
	 }
	 System.out.println("O menor numero é: " + minimo);
	 System.out.println("O maior numero é: " + maximo); 
 }
}
