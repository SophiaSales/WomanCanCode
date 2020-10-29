
public class Conta {

		String titular;
		int numeroConta;
		double saldo;
		
		void saca(double quantidade) {
			double novoSaldo = this.saldo - quantidade;;
			this.saldo =novoSaldo;
		}
		double deposita(double valorDeposito) {
			double novoSaldo = this.saldo + valorDeposito;
			this.saldo =novoSaldo;
			return novoSaldo;
		}
	 	

}
