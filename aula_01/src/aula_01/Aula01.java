package aula_01;

import java.text.DecimalFormat; // Ctrl + shift + O para fazer todas as importações 
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ( "###,###,##0.00");
		//mascara de formatação
		// leitura de dados via teclado 
		Scanner leia = new Scanner(System.in);
			
		double numero1, numero2;
		String nome;
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro número inteiro: ");
		numero1 = leia.nextDouble();
		
		
		System.out.println("Digite o segundo número inteiro: ");
		numero2 = leia.nextDouble();
	    
		
		System.out.println(" Soma: " + df.format(numero1 + numero2) );
		System.out.println(" Subtração: " + df.format(numero1 - numero2) );
		System.out.println(" multiplicação: " + df.format(numero1 * numero2) );
		System.out.println(" Divisão:  " + df.format(numero1 / numero2) );
		System.out.println(" Potência:  " + df.format(Math.pow(numero1 , numero2)) );
		System.out.println(" Raiz Quadrada:  " + df.format(Math.sqrt(numero1 )) );
		System.out.println("Nome : " + nome  );
	}

}
