
public class Carro {
	
		String cor;
		String modelo;
		
		double velocidadedeMaxima;
		double velocidadedeAtual;
		
		void liga() {
			System.out.println("O carro esta ligado");
		}
		
		void acelera(double quantidade) {
			double velocidadeNova =quantidade;
					this.velocidadedeAtual = velocidadeNova;
		}
		int pegaMarcha() {
			
			if(velocidadedeAtual < 0) {
				return-1;
			}
		    if(this.velocidadedeAtual >-0 && this.velocidadedeAtual < 40) {
		    	return 1;
		    }
		    if(this.velocidadedeAtual >= 40 && this.velocidadedeAtual < 80) {
		    	return 2;
		    }
		    	return 3;
		}
   
}
