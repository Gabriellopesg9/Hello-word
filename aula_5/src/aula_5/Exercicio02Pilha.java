package aula_5;



import java.util.Scanner;
import java.util.Stack;

public class Exercicio02Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao;
		String cliente;

		do {
			System.out.println("**************************************");
			System.out.println("1-Adicionar Livro");
			System.out.println("2-Listar Todos os Livros");
			System.out.println("3-Retirar Livro da Pilha  ");
			System.out.println("0-Sair");
			System.out.println("**************************************");
			System.out.println("Entre com a Opcao Desejada: ");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				
				System.out.println("Adicionar um Livro");
				leia.nextLine();
				cliente =leia.nextLine();
				pilha.push(cliente );
				
				break;
			case 2:
				System.out.println("Listar Todos os Livros");

				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					for (var elemento : pilha)
						System.out.println(elemento);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha Está Vazia!");
				}
				else {
			
				pilha.pop();
				System.out.println("Um Livro Foi Retirado");

				}
				break;

			default:
				if(opcao > 3)
				System.out.println("Opção Inválida");

			}

		} while (opcao != 0);
		System.out.println("Programa Finalizado!");
      leia.close();

	}

}
