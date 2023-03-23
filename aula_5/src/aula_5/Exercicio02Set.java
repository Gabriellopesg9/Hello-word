package aula_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> Numeros = new HashSet<Integer>();
		int opcao, numero;
		Numeros.add(2);
		Numeros.add(5);
		Numeros.add(1);
		Numeros.add(3);
		Numeros.add(4);
		Numeros.add(9);
		Numeros.add(7);
		Numeros.add(8);
		Numeros.add(10);
		Numeros.add(6);
		do {

			System.out.println("Deseja buscar um Número ?(1-sim/2-não)");
			opcao = leia.nextInt();
			switch (opcao) {

			case 1:
				System.out.println("Digite o número que você quer encontrar:  ");
				numero = leia.nextInt();

				if (Numeros.contains(numero))
					System.out.println("O número " + numero + " foi encontrado ");
				else
					System.out.println("O número " + numero + " não foi encontrado");
				break;
			default:
				if (opcao > 2)
					System.out.println("Opção inválida!");

			}

		} while (opcao != 2);
        leia.close();
	}

}
