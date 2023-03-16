package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ( "###,###,##0.00");
		 Scanner leia = new Scanner ( System.in);
		 
		float SalarioBruto , AdicionalNoturno , horasExtras ,Descontos , SalarioLiquido ;
		
         System.out.println("Digite o Valor do Salário Bruto: " ) ;
         SalarioBruto = leia.nextFloat( );
         
         System.out.println("Digite o Valor do Adicional Nortuno:  " ) ;
         AdicionalNoturno = leia.nextFloat();
         
         
         System.out.println("Digite o Valor da Hora Extra: " ) ;
         horasExtras = leia.nextFloat();
         
         
         System.out.println("Digite o Valor dos Descontos:  " ) ;
         Descontos = leia.nextFloat();
         SalarioLiquido = SalarioBruto + AdicionalNoturno + (horasExtras*5 ) - Descontos ;
         
         System.out.println("O Salário Liquido é : "+ df.format(SalarioLiquido) ); 
	}

}
