package aula_04;

import java.util.Scanner;

public class Exercicio01vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,contador,posicao= 0  ;
		int vetor[] = {2,5,1,3,4,9,7,8,10,6} ;
		boolean verificador = false  ; 
		
		
		System.out.println("Digite o Número que Você Deseja Encontrar: ");
		numero  = leia.nextInt(); 
		
		for ( contador = 0 ; contador < vetor.length ; contador++) {
			
			if ( vetor[contador]== numero) {
				verificador = true ;
			     posicao = contador ;}
		}
			if ( verificador ) {
				System.out.println("O numero " + numero + " está na Posição " + posicao );
			}
			else {System.out.println("O número Procurado não foi encontrado!");}
		
	}
	 

}
