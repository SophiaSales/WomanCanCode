import java.lang.constant.Constable;

public class Funcionario2 {
	private String nome;
	private String cpf;
	private Double salario;
	public int senhaPassada;
	public String getNome() {
	return nome;

}
   
   public void setNome(String nomeFuncionario2) {
	   nome = nomeFuncionario2;
	   System.out.println(nome);
   }
   public String setCpf(String cpf) {
	   System.out.println(cpf);
	   return cpf;
   }
   public int setSenha(int senha) {
	   System.out.println(senha + " senha funcionario");
	   senhaPassada = senha;
		return senha;    
   }
   public Double setSalario(Double salario) {
	   System.out.println(salario +" salario");
	   return salario;
   } 
   
}  