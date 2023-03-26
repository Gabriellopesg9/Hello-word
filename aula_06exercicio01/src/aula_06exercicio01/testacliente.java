package aula_06exercicio01;

public class testacliente {

	public static void main(String[] args) {
		cliente c1 = new cliente("Augusto Lopes de Sousa","000.000.000-00","01/01/1000","São Pedro do Piauí","Aaugustosousa@gmail.com" );
        c1.visualizar();
        cliente c2 = new cliente("Antonia Oneide Lopes de Sousa","0100.000.000-00","02/02/1025","São Pedro do Piauí","antoniasousa@gmail.com" );
        c2.visualizar();
	}

}
