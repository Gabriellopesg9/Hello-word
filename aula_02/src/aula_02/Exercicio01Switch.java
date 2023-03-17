package aula_02;

import java.util.Scanner;

public class Exercicio01Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner ( System.in); 
		
		int codigoproduto, quantidade ;
		
		
		System.out.println("Digite o Código do Produto: ") ;
		codigoproduto = leia.nextInt();
		
		System.out.println("Digite a Quantidade de Produtos: ");
         quantidade = leia.nextInt();
         
         switch ( codigoproduto ) {
         case 1 : 
        	 System.out.print("Cachorro Quente");
             System.out.print("Valor: R$ " + 10.00 * quantidade);
             break;
         case 2 : 
        	 System.out.print("X-Salada");
             System.out.print("\nValor: R$ " + 15.00 * quantidade);
             break;
         case 3 : 
        	 System.out.print("X-Bacon");
             System.out.print("\nValor: R$ " + 18.00 * quantidade);
             break;
         case 4 : 
        	 System.out.print("Bauru");
             System.out.print("\nValor: R$ " + 12.00 * quantidade);
             break;
         case 5 : 
        	 System.out.print("Refrigerante");
             System.out.print("\nValor: R$ " + 8.00 * quantidade);
             break;
         case 6 : 
        	 System.out.print("Suco de Laranja");
             System.out.print("\nValor: R$ " + 13.00 * quantidade);
             break;
             
         default: 
        	 
        	 System.out.println( "Opção Inválida");
             
         }
	}

}
