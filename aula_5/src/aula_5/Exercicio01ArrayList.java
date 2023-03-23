package aula_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01ArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Digite a " + (contador + 1) + "º cor :  ");
			cores.add(leia.nextLine());
		}
		for (var cor : cores) {
			System.out.println(cor);
		}
		System.out.println("#############################");
        cores.sort(null);
        for (var cor : cores) {
			System.out.println(cor  + "    #" );
		}
        System.out.println("#############################");
        leia.close();
	}

}
