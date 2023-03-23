package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02ArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int numero, opcao;
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		
		do {
			
		System.out.println("Deseja buscar um Número ?(1-sim/2-não)" );
		opcao = leia.nextInt();
		switch (opcao) {

		case 1:
			System.out.println("Digite o número que você quer encontrar:  ");
			numero = leia.nextInt();

			if (lista.contains(numero))
				System.out.println("O número " + numero + " está localizado na posição: " + lista.indexOf(numero));
			else System.out.println("O número "+ numero + " não foi encontrado");
			break;
		default:
			if(opcao > 2)
				System.out.println("Opção inválida!");
				
		} 
		
		} while (opcao != 2) ;
         leia.close();
	}

}
