import java.util.Scanner;

public class TestaCarro {
	public static void main (String[]args) {
		Carro meuCarro;
		
		meuCarro = new Carro();
		meuCarro.cor ="Ajul";
		meuCarro.modelo = "Onix";
		meuCarro.velocidadedeAtual = 0;
		meuCarro.velocidadedeMaxima = 80;
		
		meuCarro.liga();
		
		try(Scanner leitor = new Scanner(System.in)){
			System.out.println("Digite a velocidade: ");
			meuCarro.velocidadedeAtual = Double.parseDouble(leitor.next());
			
			meuCarro.acelera(meuCarro.velocidadedeAtual);
			
			System.out.println("Velocidade atual é: " +meuCarro.velocidadedeAtual+"KM/h");
			System.out.print("Marcha atual é:"  +meuCarro.pegaMarcha() );
		} 
	}

}
