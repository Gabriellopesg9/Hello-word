package aula_06exercicio01;

public class pessoafisica extends cliente{
          String cpf ;
	public pessoafisica(String nome, String telefone, String datadenascimento, String endereco, String email,String cpf) {
		super(nome, cpf, datadenascimento, endereco, email);
		     this.cpf =cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
		
		
	}

}
