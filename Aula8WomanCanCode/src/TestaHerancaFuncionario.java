
public class TestaHerancaFuncionario {
	public static void main (String[]args) {
		
		Gerente gerenteBanco = new Gerente();
		
		gerenteBanco.setNome("sophia");
		gerenteBanco.setCpf("123.456.321-89");
		gerenteBanco.setSenha(1234);
		gerenteBanco.autentica(1234);
		gerenteBanco.setSalario(100.000);
	} 

}
