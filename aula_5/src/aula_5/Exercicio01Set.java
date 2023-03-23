package aula_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio01Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> Numeros = new HashSet<Integer>();

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite o " + (contador + 1)+"º número");
			Numeros.add(leia.nextInt());

		}
            System.out.println("Listar Dados do Set:");
		for (var numero : Numeros)
			
			System.out.println(numero);

		leia.close();
	}

}
