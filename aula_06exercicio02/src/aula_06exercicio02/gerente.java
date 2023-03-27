package aula_06exercicio02;

public class gerente extends funcionario{
             private String setor ;
	public gerente(String nome, String cpf, String cargo, String contratacao, float salario,String setor) {
		super(nome, cpf, cargo, contratacao, salario);
		this.setor = setor;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Reponsável Pelo Setor: "+ this.setor);
		
	}

}
