import java.util.Scanner;
public class Converte {
	@SuppressWarnings("resource")
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double C,F;
		
		System.out.print("Digite a temperatura em Graus Celsius: ");
		C = input.nextDouble();
		
		F = (9 * C + 160) / 5;
		System.out.printf("A temperatura convertida para Fahrenheit é: " + F);
	}

}
