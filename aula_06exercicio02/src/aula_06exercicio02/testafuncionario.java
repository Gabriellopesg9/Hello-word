package aula_06exercicio02;
import aula_06exercicio02.vendedor;
import aula_06exercicio02.gerente;

public class testafuncionario {

	public static void main(String[] args) {
		funcionario f1 = new funcionario("João Batista", "300.000.000-00","86 99837-0990","01/02/2000",2000.0f);
		f1.visualizar();
		funcionario f2 =new funcionario("Thyelle", "800.000.000-00","86 98799-9870","02/04/1996",15000.0f);
		f2.visualizar();
		// Testa vendedor 
		vendedor V1 =new vendedor("Lucivaldo sousa","400.000.000-00","86 99876-0998","01/03/1990",3000.0f,1000.0f);
		V1.visualizar();
		// Testa Gerente 
		gerente G1 = new gerente("Felipe sousa","500.000.000-00","86 99809-0988","05/06/2000",5000.0f,"Marketing");
		G1.visualizar();		
	}

}
