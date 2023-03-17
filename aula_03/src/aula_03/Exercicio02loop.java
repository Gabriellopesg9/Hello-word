package aula_03;

import java.util.Scanner;

public class Exercicio02loop {

	public static void main(String[] args) {
	 
		Scanner leia = new Scanner (System.in);
		
		int idade =  1 ,contador1 =0 , contador2 = 0  ; 
		
		
		     
		     
		 
		 while ( idade > 0 ){
			 
			  System.out.println("Digite a idade da Pessoa: ");
		     idade = leia.nextInt();
			 
			
			 if (idade < 21  ) {
				  contador1++    ;
				 
			 }
			 else if (idade > 50 ){ contador2++ ; }
			  
		 }
		 
		 System.out.println("O Total de Pessoas Menores que 21 anos é: " +(  contador1-1 ) );
         System.out.println(" O Total de Pessoas Maiores de 50 anos é:  " + contador2 );
	}

}
