import java.util.Date;
public class Main {
	public static void main(String[]args) {
		Aluno i = new Aluno("Gabriel","987.765.543-21",new Date());
		System.out.println("Veja como os atributos foram preenchidos \n\nNome: "+i.nome);
		System.out.println("CPF: "+i.cpf);
		System.out.println("Data de nascimento: "+i.data_nascimento.toString());
		i.matricula="Java";
		System.out.println("Matricula: "+i.matricula);
		
		Professor prf = new Professor("sophia", "123.344.543-21", new Date());
		System.out.println("Veja como os atributos nome dp professor foram preenchidos\n\nNome: "+prf.nome);
		System.out.println("CPF: "+prf.cpf);
		System.out.println("Data de nascimento: " +prf.data_nascimento.toString());
		prf.disciplina = "prof.Java";
		prf.salario = 100.00D;
		System.out.println("Disciplina: " +prf.disciplina);
		System.out.println("Salario" +prf.salario);
		
		Funcionario func = new Funcionario("Marcos","678.987.456-09", new Date());
		System.out.println("Veja como os atributos nome de professor foram preenchidos\n\nNome: " +func.nome);
		System.out.println("CPF:" + func.cpf);
		System.out.println("Data de nascimento: " +func.data_nascimento.toString());
		func.salario = 12.000D;
		func.cargo ="Diretor";
		System.out.println("salario " +func.salario);
		System.out.println("cargo "+func.cargo);
	}
	
  
}
