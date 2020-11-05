
public class Gerente extends Funcionario2 {
	private int senharecebida;
	public int senha;
	public void getSenha() {
		super.setSenha(senharecebida);
	}
   public boolean autentica(int testaSenha) {
   System.out.println(testaSenha + " senha gerente");
   
   if (testaSenha == super.senhaPassada ) {
	System.out.println("Acesso Permitido");
	return true;
   }else {
	   System.out.println("Acesso negado");
	   return false;
   }
	
   }
}

