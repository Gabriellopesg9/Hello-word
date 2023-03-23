package aula_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String cliente;

		do {
			System.out.println("**************************************");
			System.out.println("1-Adicionar Cliente");
			System.out.println("2-Listar Clientes");
			System.out.println("3-Remover  Cliente");
			System.out.println("0-Sair");
			System.out.println("**************************************");
			System.out.println("Entre com a Opcao Desejada: ");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				
				System.out.println("Adicionar um Cliente na Fila");
				leia.nextLine();
				cliente =leia.nextLine();
				fila.add(cliente );
				
				break;
			case 2:
				System.out.println("Listar Todos os Clientes");

				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					for (var elemento : fila)
						System.out.println(elemento);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila Está Vazia!");
				}
				else {
				

				fila.remove();
				System.out.println("Cliente Retirado");}
				break;

			default:
				if(opcao > 3)
				System.out.println("Opção Inválida");

			}

		} while (opcao != 0);
      leia.close();
	}

}
