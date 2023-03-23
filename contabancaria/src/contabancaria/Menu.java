package contabancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1-Criar Conta                            ");
			System.out.println("            2-Listar Todas as  Contas                ");
			System.out.println("            3-Buscar Conta por Número                ");
			System.out.println("            4-Atualizar Dados da Conta               ");
			System.out.println("            5-Apagar Conta                           ");
			System.out.println("            6-Sacar                                  ");
			System.out.println("            7-Depositar                              ");
			System.out.println("            8-Transferir valores entre Contas        ");
			System.out.println("            9-Sair                                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com  a opão desejada                           ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1 -> System.out.println("Criar Conta\n\n");
			case 2 -> System.out.println("Listar Todas as  Contas");
			case 3 -> System.out.println("Buscar Conta por Número");
			case 4 -> System.out.println("Atualizar Dados da Conta");
			case 5 -> System.out.println("Apagar Conta");
			case 6 -> System.out.println("Sacar");
			case 7 -> System.out.println("Depositar");
			case 8 -> System.out.println("Transferir valores entre Contas");
			case 9 -> System.out.println("Sair");
			default -> System.out.println("Opção inválida!");

			}
		}

	}

}
