package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ( "###,###,##0.00");
		
		Scanner leia = new Scanner ( System.in); 
		
		
		
		float nota1, nota2 , nota3 ,nota4, media  ; 
		
		System.out.println("Digite a primera nota: ");
		
		nota1 = leia.nextFloat( ) ;
		
		System.out.println("Digite a Segunda nota: ");
		
		nota2 = leia.nextFloat( );
		
		
		System.out.println("Digite a Terceira nota: ");
		
		nota3 = leia.nextFloat( );
		
		
		System.out.println("Digite a Quarta  nota: ") ;
		
		nota4 = leia.nextFloat( );
		
		media = (nota1 + nota2 + nota3 + nota4 ) / 4 ;
		
		System.out.println(" A media é:" + df.format(media) ); 
	} 

}
