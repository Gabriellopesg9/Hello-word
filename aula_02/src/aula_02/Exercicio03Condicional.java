package aula_02;

import java.util.Scanner;

public class Exercicio03Condicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade; 
		boolean PrimeiraDoacao = false   ;
		String  Nome ;
		char doacao  ; 
         
		System.out.println("Digite o Nome do Doador: " );
		Nome = leia.nextLine(); 
		
		System.out.println("Digite a Idade do Doador: "  );
		
		idade = leia.nextInt();
		
		System.out.println("Primeira Doação de Sangue: (s/n ) ?" );
		leia.skip("\\R?");
		 doacao = leia.nextLine().charAt(0);
		 
		 if (doacao == 's') 
			 PrimeiraDoacao = true ;
		 if ( 70 > idade  && idade > 59  ) {
			 if(PrimeiraDoacao) {
			 System.out.println( Nome + " Não está apto a Doar!" );
			 }
			 else { System.out.println( Nome + " Está apto a Doar!");}
		    }
		 else if ( idade > 69 &&  18 > idade )
			 System.out.print(Nome + " Não está apto a Doar!");
		 else { System.out.println( Nome + " Está apto a Doar!"); }
		 
	}  

}
