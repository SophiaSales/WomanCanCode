
public class Gerente extends Funcionario {
	private int senharecebida;
	public int senha;
	public void getSenha() {
		super.setSenha(senharecebida);
	}
   public boolean autentica(int testaSenha) {}
   System.out.println(testaSenha + "autentica classe gerente");
   if (testaSenha == super.senhaPassada ){
	System.out.println("Acesso Permitido");
	return true;
   }else {
	   System.out.println("Acesso negado");
	   return false;
   }
}
