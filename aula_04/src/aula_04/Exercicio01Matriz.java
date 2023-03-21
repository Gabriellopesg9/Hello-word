package aula_04;

import java.util.Scanner;

public class Exercicio01Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner( System.in);
		int matriz[][] = new int[3][3] ;
		int linha,numero ;
		
		for (linha = 0; linha < matriz.length; linha ++ ) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite um número para o elemento " + linha + coluna +  " da Matriz: " );
                matriz[linha][coluna] = leia.nextInt();		
                }	
		
		}
		
		
		System.out.println("Elemetos da Diagonal principal:" + matriz[0][0] +" " +matriz[1][1] +" "+ matriz[2][2]);
		System.out.println("Elemetos da Diagonal Secundária :" + matriz[2][0] +" "+ matriz[1][1]+" "+  matriz[0][2]);
		System.out.println("Soma dos Elemetos da Diagonal principal:" + (matriz[0][0] +matriz[1][1]+matriz[2][2]) );
		System.out.println("Soma dos Elemetos da Diagonal Secundária:" + (matriz[2][0] + matriz[1][1]+ matriz[0][2]));
                }	
	

}
