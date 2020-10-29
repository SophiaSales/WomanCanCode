
public class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		
		minhaConta = new Conta();
		
		minhaConta.titular ="Sophia";
		minhaConta.saldo = 10000;
		minhaConta.deposita(10000);
		minhaConta.saca(100);;
		
		System.out.println("Saldo atual; " + minhaConta.saldo);
		System.out.println("Titular: " + minhaConta.titular);
		
		
	}
   
}
