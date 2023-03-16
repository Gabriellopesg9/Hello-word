package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ( "###,###,##0.00");
		Scanner leia = new Scanner ( System.in ); 
		  
		 
	
         float n1 , n2 , resultado ; 
         System.out.println("Digite o Salário: ");
         n1 = leia.nextFloat( ) ;
         System.out.println("Digite o Abono: " );
         n2 = leia.nextFloat( ) ;
        resultado =  n1 + n2  ; 
        System.out.println(" O salário final é: " + df.format(resultado) ) ;
	}

}
