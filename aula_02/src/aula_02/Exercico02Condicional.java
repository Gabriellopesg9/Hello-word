package aula_02;

import java.util.Scanner;

public class Exercico02Condicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner( System.in); 
		
		int n1 ; 
		System.out.println("Digite um número: "  );
		n1 = leia.nextInt();
		
		
		if ( n1% 2 == 0 && (n1> 0 )  ) {
			
			System.out.print("O Número " + n1 + " é Par e Positivo! ");
			
			
		}
		
		else if (n1% 2== 0 && ( n1< 0 )) {
			
			System.out.println("O Número "+ n1 + " 3é Par e Negativo! ");
		}
		
		else if (( n1% 2 == 1 && (n1 > 0 ) )|| (n1% 2 == -1 && (n1 > 0 ) ) ) {
			
			System.out.println("O Número "+ n1 + " é Impar e Positivo!");
		}
		
		else if ((n1%2 == 1 && (n1< 0 )) ||( n1%2 == -1 && ( n1< 0 )) ) { 
			
			System.out.println("O Número "+ n1+ " é impar e Negativo!");
		}
		else { System.out.println("O Número Digitado é Nulo!");}
	}

}
