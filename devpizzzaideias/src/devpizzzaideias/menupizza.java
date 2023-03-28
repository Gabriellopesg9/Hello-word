package devpizzzaideias;

import java.util.Scanner;

public class menupizza {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao, pizza,borda,opcao3,opcao4,bebida;
		String pedido="";
		
		do {
		
		
		
		System.out.println("1-Cadastrar Pedido");
        System.out.println("2-Faturamento Semanal");
		System.out.println("3-Faturamento Mensal");
		System.out.println("4-faturamento Anual");
		System.out.println("5-Sair");
		opcao=leia.nextInt();
		
		switch (opcao) {
		case 1 -> {
            System.out.println("1-Frango com Catupiry");
			System.out.println("2-Calabresa");
			System.out.println("3-mussarela");
			System.out.println("4-Milho com queijo");
			System.out.println("5-Chocolate");
			System.out.println("6-Chocolate Branco ");
			pizza =leia.nextInt();
			
			switch (pizza) {
			
			
			
			case 1 -> {pedido = pedido + "Frango com Catupiry" ; }

			case 2 -> { pedido = pedido + "Calabresa" ; }

			case 3 -> {pedido = pedido + "Mussarela" ;}

			case 4 -> {pedido = pedido + "Milho com Queijo" ;}

			case 5 -> {pedido = pedido + "Chocolate" ;}

			case 6 -> { pedido = pedido + "Chocolate Branco" ;}

			}
			System.out.println("Deseja Borda Recheada?(1-sim/2-não)");
			borda =leia.nextInt();
			if (borda ==1) {
				System.out.println("1- Borda de Catupiry");
				System.out.println("2- Borda de Cheddar");
				System.out.println("3- Borda de Chocolate");
				System.out.println("4- Borda de Doce de Leite");
			    opcao3 = leia.nextInt();
				
				
				
				
				switch (opcao3) {
				case 1 -> { pedido = pedido + " Borda de Catupiry" ;}
				case 2 -> { pedido = pedido + " Borda de Cheddar" ;}
				case 3 -> { pedido = pedido + " Borda de Chocolate" ;}
				case 4 -> { pedido = pedido + " Borda de Doce de Leite" ;}
				
				
				
				
				}
				
				
			
			
			
			
			
			
			}else {  pedido = pedido + " Sem Borda" ; }
			
			System.out.println("Deseja Adicionar Bebida?(1-sim/2-não)");
			bebida =leia.nextInt();
			if (bebida ==1) {
				System.out.println("1- Suco de Laranja");
				System.out.println("2- Suco del Vale ");
				System.out.println("3- Coca-Cola");
				System.out.println("4- Guaraná Antartica");
			    opcao4= leia.nextInt();
				
				
				
				
				switch (opcao4) {
				case 1 -> { pedido = pedido + " Com Suco de Laranja" ;}
				case 2 -> { pedido = pedido + " Com Suco del Vale" ;}
				case 3 -> { pedido = pedido + " Com Coca-Cola" ;}
				case 4 -> { pedido = pedido + " Com Guaraná Antartica" ;}
				
				
				
				
				}
				
				
			
			
			
			
			
			
			}else {  pedido = pedido + " Sem Bebida" ; }
			
       System.out.println("Pedido Pizza de : "+ pedido);
		}

		case 2 -> {
			
		}

		case 3 -> {
			
		}

		case 4 -> {
			
		}

		}
		
		}while(opcao!=5);
		


		
}

}
