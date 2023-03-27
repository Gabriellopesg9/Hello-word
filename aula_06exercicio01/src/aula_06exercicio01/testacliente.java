package aula_06exercicio01;
import aula_06exercicio01.pessoafisica;
import aula_06exercicio01.pessoajuridica;
public class testacliente {

	public static void main(String[] args) {
		cliente c1 = new cliente("Augusto Lopes de Sousa","86 99832-0101","01/01/1000","São Pedro do Piauí","Aaugustosousa@gmail.com" );
        c1.visualizar();
        cliente c2 = new cliente("Antonia Oneide Lopes de Sousa","0100.000.000-00","02/02/1025","São Pedro do Piauí","antoniasousa@gmail.com" );
        c2.visualizar();
        //Testa Pessoa Fisica
        pessoafisica pf =new pessoafisica("Antonio Soares","86 99805-2825","01/01/1979","São Pedro do Piauí","antoniosoares@gmail.com","100.000.000-00");
        pf.visualizar();
        //Testa Pessoa Juridica
        pessoajuridica pj =new pessoajuridica("Agrotec","32023435","01/01/2010","Teresina-Pi","agrotec@.gmail.com","10.000.000/000-00");
        pj.visualizar();
     }

}
