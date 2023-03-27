package aula_06exercicio01;

public class cliente {
	private String nome ; 
	private String telefone ; 
	private String datadenascimento ;
	private String endereco ;
	private String email ;
	public cliente(String nome, String telefone, String datadenascimento, String endereco, String email) {
		this.nome = nome;
		this.telefone = telefone;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		System.out.println("\nNome: "+ this.nome+"                                  ");
		System.out.println("\nTelefone: "+ this.telefone+"                          ");
		System.out.println("\nData de Nascimento: "+ this.datadenascimento+"        ");
		System.out.println("\nEndereço: "+ this.endereco+"                          ");
		System.out.println("\ne-mail: "+ this.email+"                               ");
		
		
		
		
	}

}
