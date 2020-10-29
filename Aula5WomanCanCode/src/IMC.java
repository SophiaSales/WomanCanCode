import java.util.Scanner;

public class IMC {
	public static void main (String[]args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		double pc,alt,vlrIMC;
		System.out.printf("Imforme seu peso corporal(em kg): ");
		pc = ler.nextDouble();
		System.out.printf("Imforme sua altura: ");
		alt = ler.nextDouble();
		vlrIMC = IMC(pc,alt);
		System.out.printf(" Resultados: ");
		System.out.printf("Imc  :%.2f ", vlrIMC);
		System.out.printf("Classificaçao: %s" ,interpretaIMC(vlrIMC));
		
	}
	
public static double IMC(double pc, double alt) {
	return(pc/(alt*alt));
}

public static String interpretaIMC(double vlrIMC) {
	if(vlrIMC<18.5)
		return("Peso baixo");
	else if (vlrIMC<25.0)
		return("Peso adequedo");
	else if (vlrIMC<30.0)
		return("Sobrepeso");
	else return("obesidade");
}

}
