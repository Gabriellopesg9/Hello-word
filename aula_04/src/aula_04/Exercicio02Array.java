package aula_04;

import java.util.Scanner;

public class Exercicio02Array {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int vetor[]= new int[10];
		  
		float media = 0, soma = 0 ;
		String impares = " " ,pares = " " ;
		
		
		
		for ( int contador = 0; contador < 10 ;contador ++  ) {
		    System.out.println("Digite o " + (contador + 1) + "° número: ");
		     vetor[contador] = leia.nextInt();
		        soma = (soma + vetor[contador]);
		     if ( contador%2 == 1)
		    	 impares = impares +" "+  vetor[contador] ;
		     if(vetor[contador]%2 == 0)
		    	 pares = pares +" " + vetor[contador];
		     media = (soma / 10);
		}
		System.out.println("Elementos nos Índices Ímpares:  "+  impares);
		System.out.println("Elementos nos Índices Pares:  "+  pares );
		System.out.println("A Soma dos Elementos é:  "+ soma);
		System.out.println("A média dos Elementos é :  " + media  );
	}

}
