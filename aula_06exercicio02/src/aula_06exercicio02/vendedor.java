package aula_06exercicio02;

public class vendedor extends funcionario {
	private float metadevenda;

	public vendedor(String nome, String cpf, String cargo, String contratacao, float salario, float metadevenda) {
		super(nome, cpf, cargo, contratacao, salario);
		this.metadevenda = metadevenda;
	}

	public float getMetadevenda() {
		return metadevenda;
	}

	public void setMetadevenda(float metadevenda) {
		this.metadevenda = metadevenda;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Meta de vendas: "+ this.metadevenda);
		
	}
}
