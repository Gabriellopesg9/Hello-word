package contabancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import contabancaria.controller.contacontroller;
import contabancaria.model.conta;
import contabancaria.util.cores;
import contabancaria.model.contacorrente;
import contabancaria.model.contapoupanca;
public class Menu {

	public static void main(String[] args) {
		contacontroller contas = new contacontroller();
		
		Scanner leia = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		while (true) {
			System.out.println(cores.TEXT_BLUE+ cores.ANSI_BLACK_BACKGROUND+"*****************************************************");
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
			System.out.println("                                                     "+ cores.TEXT_RESET);
             try {
			opcao = leia.nextInt();
             }catch(InputMismatchException e) {
            	 System.out.println("Digite valores inteiros!");
            	 leia.nextLine();
            	opcao=0;
             }
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1 -> {
				System.out.println("Criar Conta\n\n");
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					contas.cadastrar(new contacorrente(contas.gerarNumero(),agencia,tipo,titular,saldo,limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					contas.cadastrar(new contapoupanca(contas.gerarNumero(),agencia,tipo,titular,saldo, aniversario));
				}
				}
				keyPress();
			}
			case 2 -> {System.out.println("Listar Todas as  Contas");
			contas.listarTodas();
			keyPress();
			}
			case 3 -> {
				System.out.println("Buscar Conta por Número");
				System.out.println("Digite o número da conta: ");
				
				numero = leia.nextInt();
				contas.procurarPoNumero(numero);
				keyPress();			}
			case 4 -> {System.out.println("Atualizar Dados da Conta");
			System.out.println("Digite o número da conta: ");
			numero = leia.nextInt();
			if(contas.buscarNacollection(numero) != null) {

			tipo =contas.retornaTipo(numero); 
			// condicional buscar na collection

			System.out.println("Digite o Numero da Agência: ");
			agencia = leia.nextInt();
			System.out.println("Digite o Nome do Titular: ");
			leia.skip("\\R?");
			titular = leia.nextLine();

			System.out.println("Digite o Saldo da Conta (R$): ");
			saldo = leia.nextFloat();

			// retornar tipo

			switch (tipo) {
			case 1 -> {
				System.out.println("Digite o Limite de Crédito (R$): ");
				limite = leia.nextFloat();

				contas.atualizar(new contacorrente(numero,agencia,tipo,titular,saldo,limite));
			}
			case 2 -> {
				System.out.println("Digite o dia do Aniversario da Conta: ");
				aniversario = leia.nextInt();

				contas.atualizar(new contapoupanca(numero, agencia, tipo, titular, saldo, aniversario));

			}
			default -> {
				System.out.println("Tipo de conta inválido!");
			}
			}
			
			}else {
				System.out.println("A Conta não foi encontrada!");
			}

			// fim do condicional buscar na collection
			

			
			keyPress();
			}
			case 5 -> {
				System.out.println("Apagar Conta");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				contas.deletar(numero);
				keyPress();
			}
			case 6 -> {
				System.out.println("Sacar");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				System.out.println("Digite o valor do Saque: ");
				valor = leia.nextFloat();
				contas.sacar(numero, valor);
				keyPress();
			}
			case 7 -> {
				System.out.println("Depositar");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				System.out.println("Digite o valor do Depósito: ");
				valor = leia.nextFloat();
				contas.depositar(numero, valor);
				keyPress();
			}
			case 8 -> {System.out.println("Transferir valores entre Contas");
			System.out.println("Transferência entre Contas\n\n");

			System.out.println("Digite o Numero da Conta de Origem: ");
			numero = leia.nextInt();
			System.out.println("Digite o Numero da Conta de Destino: ");
			numeroDestino = leia.nextInt();

			do {
				System.out.println("Digite o Valor da Transferência (R$): ");
				valor = leia.nextFloat();
			} while (valor <= 0);
			contas.transferir(numero, numeroDestino, valor);
			keyPress();
			}
			
			default ->{ System.out.println("Opção inválida!");
			keyPress();
			}
                    
			}
			}
		}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Gabriel Lopes -lopesgabriel810@gmail.com");
		System.out.println("github.com/Gabriellopesg9");
		System.out.println("*********************************************************");
	
}
	public static void keyPress() {
		try {
			System.out.println(cores.TEXT_RESET+ "Pressione a tecla enter para continuar...");
		    System.in.read();
		}catch(IOException e ) {
			System.out.println("Erro de digitação!");
		}
		
	}

}
