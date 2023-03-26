package aula_06exercicio02;

public class funcionario {
	private String nome ;
	private String cpf ;
	private String cargo;
	private String contratacao;
	private float salario ;
	public funcionario(String nome, String cpf, String cargo, String contratacao, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.contratacao = contratacao;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getContratacao() {
		return contratacao;
	}
	public void setContratacao(String contratacao) {
		this.contratacao = contratacao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public void visualizar ( ) {
		System.out.println("********************************************************");
		System.out.println("*                                                      *");
		System.out.println("*                DADOS DO FUNCIONÁRIO                  *");
		System.out.println("*                                                      *");
		System.out.println("********************************************************");
		System.out.println("\nNome: "+ this.nome+"                                  ");
		System.out.println("\nCPF: "+ this.cpf+"                                    ");
		System.out.println("\nCargo: "+ this.cargo+"                                ");
		System.out.println("\nData da Contratação: "+ this.contratacao+"            ");
		System.out.println("\nSalário: "+ this.salario+"                            ");
		
		
		
		
	}


}
