package aula_06exercicio01;

public class cliente {
	private String nome ; 
	private String cpf ; 
	private String datadenascimento ;
	private String endereco ;
	private String email ;
	public cliente(String nome, String cpf, String datadenascimento, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.datadenascimento = datadenascimento;
		this.endereco = endereco;
		this.email = email;
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
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	public void visualizar ( ) {
		System.out.println("********************************************************");
		System.out.println("*                                                      *");
		System.out.println("*                DADOS DO CLIENTE                      *");
		System.out.println("*                                                      *");
		System.out.println("********************************************************");
		System.out.println("\nNome: "+ this.nome+"                                    ");
		System.out.println("\nCPF: "+ this.cpf+"                                      ");
		System.out.println("\nData de Nascimento: "+ this.datadenascimento+"          ");
		System.out.println("\nEndereço: "+ this.endereco+"                            ");
		System.out.println("\ne-mail: "+ this.email+"                                 ");
		
		
		
		
	}

}
