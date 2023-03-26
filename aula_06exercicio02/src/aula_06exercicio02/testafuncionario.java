package aula_06exercicio02;

public class testafuncionario {

	public static void main(String[] args) {
		funcionario f1 = new funcionario("João Batista", "300.000.000-00","Desenvolvedor","01/02/2000",2000.0f);
		f1.visualizar();
		funcionario f2 =new funcionario("Thyelle", "800.000.000-00","CEO","02/04/1996",15000.0f);
		f2.visualizar();
	}

}
