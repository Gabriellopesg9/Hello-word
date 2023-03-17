package aula_03;

import java.util.Scanner;

public class Exercicio01Loop {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int num1,num2 ; 
		
		System.out.println("Digite o primeiro Número : ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o Segundo Número : ");
		num2 = leia.nextInt(); 
		
		if ( num1 > num2 )
			System.out.println("Intervalo Inválido!" );
		else {
		
		  for( int contador = num1 ; contador < num2 ; contador ++ ) {
		
			if ( num1%3 == 0 && num1%5 ==0 )
				System.out.println( num1 + " É multiplo de 3 e 5 " );
		     num1++; 
		 }
		 
		} 
	}

}
