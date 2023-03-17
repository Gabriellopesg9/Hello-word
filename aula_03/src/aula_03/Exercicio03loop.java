package aula_03;

import java.util.Scanner;

public class Exercicio03loop {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero  , soma = 0  ; 
		
		do {
			System.out.println( "Digite  um Número :  " );
			numero = leia.nextInt();
			if (numero > 0 )
				soma += numero ; 
			
			
		}while( numero != 0 ); 
		
		 System.out.println( "A Soma dos Número Positivos é: " + soma );
		
		
           	}
   
}
