package aula_06exercicio01;

public class pessoajuridica extends cliente{
            String cnpj;
	public pessoajuridica(String nome, String telefone, String datadenascimento, String endereco, String email,String cnpj) {
		super(nome, telefone, datadenascimento, endereco, email);
		    this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
public void visualizar() {
	super.visualizar();
	System.out.println("CNPJ:"+this.cnpj);
	
	
	
}
}
