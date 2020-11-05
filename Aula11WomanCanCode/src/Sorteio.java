import java.util.Scanner;
public class Sorteio {
	static int NUMERO_DEZENAS = 6;
	
	public static void main (String[]args) {
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	
	int[] sorteio = sorteaSena();
	int[] aposta = new int [NUMERO_DEZENAS];
	
	System.out.println("Faça sua aposta: ");
	for (int i = 0; i<NUMERO_DEZENAS; i++){
		int nroAposta;
		boolean repetido = false;
		do {
			System.out.print("Informe a dezena" +(i+1)+":");
			nroAposta= teclado.nextInt();
			if(nroAposta <= 0 || nroAposta>60) {
				System.out.println("Numero invalido, aposta cancelada! ");
				return;
			}
			repetido = existeNumero(aposta,nroAposta);
			if(repetido) {
				System.out.println("Ops, numero repetido");
			}
		}while(repetido);
		aposta[i] = nroAposta;
	}
	System.out.println("\nConfira sua resposta: ");
	for(int i = 0; i< aposta.length; i++) {
		System.out.print(aposta[i]+"");
	}
	System.out.print("\nResultado do sorteio: ");
	for(int i =0; i <sorteio.length; i++) {
		System.out.print(sorteio[i] +"");
	}
	int nroAcertos = contaAcertos(sorteio,aposta);
	System.out.println("\nNumero de acretos: "+nroAcertos);
	
	switch(nroAcertos) {
	case 4: System.out.println("Parabens. Voce acertou a quadra");break;
	case 5: System.out.println("Parabens. Voce acertou a quina!");break;
	case 6: System.out.println("Parabens.Voce é campeao da MegaSena! ");break;
	default: System.out.println("Não foi dessa vez. Tente novamente!");break;
	
}


	}
	static int [] sorteaSena() {
		int[] resultado = new int[NUMERO_DEZENAS];
		
		for(int i = 0; i <NUMERO_DEZENAS; i++) {
			int sorteado;
			boolean repetido = false;
			
			do {
				sorteado = (int)(Math.random()*60)+1;
				repetido = existeNumero(resultado, sorteado);
			}while(repetido);
			resultado[i] = sorteado;
		}
		return resultado;

}
	static boolean existeNumero(int[]numeros,int n) {
		for(int i =0; i <numeros.length; i++) {
			if(numeros[i] == n) {
				return true;
			}
		}
	return false;
	
	}
	static int contaAcertos(int[] sorteio, int[] aposta) {
		int acertos = 0;
		for (int i =0; i <NUMERO_DEZENAS;i++) {
			int nroAposta = aposta[i];
			if(existeNumero(sorteio, nroAposta)) {
				acertos++;
			}
		}
		return acertos;
	}


}
