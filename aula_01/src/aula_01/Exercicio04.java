package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ( "###,###,##0.00");
		
		Scanner leia = new Scanner (System.in);
		float n1,n2,n3,n4, resultado ;
		
		System.out.println("Digite o primeiro Número: ");
		n1 = leia.nextFloat ();
		System.out.println("Digite o Segundo Número: ");
		n2 = leia.nextFloat ();
		
		System.out.println("Digite o Terceiro Número: ");
		n3 = leia.nextFloat ();
		
		
		System.out.println("Digite o Quarto  Número: ");
		n4 = leia.nextFloat ();
		resultado = (n1*n2)-(n3*n4) ; 
		System.out.println("O Calculo é : " + df.format(resultado));
	}

}
