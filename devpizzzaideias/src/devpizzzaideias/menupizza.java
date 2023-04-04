package devpizzzaideias;

import java.util.ArrayList;
import java.util.Scanner;


import devpizzzaideias.controller.DevpizzaideiasCotroller;
import devpizzzaideias.model.Devpizzaideias;

public class menupizza {

	public static void main(String[] args) {
		DevpizzaideiasCotroller Pedidos = new DevpizzaideiasCotroller();
		ArrayList<Float> notas = new ArrayList<Float>();
		
		Scanner leia = new Scanner(System.in);
		int opcao, pizza,borda,opcao3,opcao4,opcao5,bebida,tamanho=0, sabor=0;
		float valor;
	
		
		
		do {
		
		String pedido="";
		
		System.out.println("1-Cadastrar Pedido");
        System.out.println("2-Faturamento Semanal");
		System.out.println("3-Faturamento Mensal");
		System.out.println("4-faturamento Anual");
		System.out.println("5-Sair");
		opcao=leia.nextInt();
		
		switch (opcao) {
		
		case 1 -> {
			System.out.println("Escolha o tamanho da Pizza!");
			System.out.println("1-Pequena");
			System.out.println("2-Média");
			System.out.println("3-Grande");
			opcao5 = leia.nextInt();
			
			switch (opcao5) {
			case 1->{
            System.out.println("1-Frango com Catupiry");
			System.out.println("2-Calabresa");
			System.out.println("3-mussarela");
			System.out.println("4-Milho com queijo");
			System.out.println("5-Chocolate");
			System.out.println("6-Chocolate Branco ");
			pizza =leia.nextInt();
			
			switch (pizza) {
			
			
			
			case 1 -> {pedido = pedido + "Frango com Catupiry" ; 
			     tamanho = 1;
			     sabor = 1;
			}

			case 2 -> { pedido = pedido + "Calabresa" ; }

			case 3 -> {pedido = pedido + "Mussarela" ;}

			case 4 -> {pedido = pedido + "Milho com Queijo" ;}

			case 5 -> {pedido = pedido + "Chocolate" ;}

			case 6 -> { pedido = pedido + "Chocolate Branco" ;}

			}
			}
			case 2-> {
				   System.out.println("1-Frango com Catupiry");
					System.out.println("2-Calabresa");
					System.out.println("3-mussarela");
					System.out.println("4-Milho com queijo");
					System.out.println("5-Chocolate");
					System.out.println("6-Chocolate Branco ");
					pizza =leia.nextInt();
					
					switch (pizza) {
					
					
					
					case 1 -> {pedido = pedido + " Frango com Catupiry" ; }

					case 2 -> { pedido = pedido + " Calabresa" ; }

					case 3 -> {pedido = pedido + " Mussarela" ;}

					case 4 -> {pedido = pedido + "Milho com Queijo" ;}

					case 5 -> {pedido = pedido + "Chocolate" ;}

					case 6 -> { pedido = pedido + "Chocolate Branco" ;}
					}
					}
					case 3 -> {   System.out.println("1-Frango com Catupiry");
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
				
				
				
				
				
				
			}
					
					
					
			
			
			
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
				case 1 -> { pedido = pedido + " com  Borda de Catupiry" ;
				borda= 1 ;}
				
				case 2 -> { pedido = pedido + " com Borda de Cheddar" ;}
				case 3 -> { pedido = pedido + " com Borda de Chocolate" ;}
				case 4 -> { pedido = pedido + " com Borda de Doce de Leite" ;}
				
				
				
				
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
				case 1 -> { pedido = pedido + " e Suco de Laranja" ;
				bebida = 1;}
				case 2 -> { pedido = pedido + " e Suco del Vale" ;}
				case 3 -> { pedido = pedido + " e Coca-Cola" ;}
				case 4 -> { pedido = pedido + " e Guaraná Antartica" ;}
				
				
				
				
				}
				
				
			
			
			
			
			
			
			}else { pedido = pedido + " Sem Bebida" ; }
			
			valor = 35.0f ;
			
       System.out.println("Pedido Pizza de : "+ pedido);
       notas.add(valor);
       Pedidos.cadastrarpedido(new Devpizzaideias(tamanho,sabor,borda,bebida,valor));
        
		}

		case 2 -> {
			Pedidos.faturamentodiariao();
			      
			    	  var  soma = notas.stream().mapToInt(Float::intValue).sum();
			    	  System.out.println(soma);
			    	  
			    	  
			      
		}

		case 3 -> {
			
		}

		case 4 -> {
			
		}

		}
		
		}while(opcao!=5);
		


		
}

}
