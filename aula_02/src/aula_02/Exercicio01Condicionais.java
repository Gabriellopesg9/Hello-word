package aula_02;

import java.util.Scanner;

public class Exercicio01Condicionais {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int A, B , C;
		
		System.out.println("\nDigite o número A: ");
		A = leia.nextInt();
		
		System.out.println("\nDigite o número B: ");
		B = leia.nextInt();
		
		System.out.println("\nDigite o número C: ");
		C = leia.nextInt();
		
		if (A+B > C  ) {
			
			System.out.println("A Soma A+B é Maior do que C "); 
			
		}
		
		if (A+B < C ) {
			
			System.out.println("A Soma de A+B é Menor do que C ");
		}
		
		if (A+B == C ) {
			
			
			System.out.println("A Soma A+B é Igual a C ");
		}
	}

}
