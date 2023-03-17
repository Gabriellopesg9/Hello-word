package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02Switch {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat ( "###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		int codigocargo ; 
        String colaborador ; 
        float salario;
        System.out.println("Degite o Nome do Colaborador: ");
        colaborador = leia.nextLine();
       System.out.println("Digite o Código do Cargo: ");
        codigocargo = leia.nextInt();
        System.out.println("Digite o Salário: ");
        salario =leia.nextFloat();
        
        switch (codigocargo) {
        
        case 1: 
        	System.out.println("Nome do Colaborador: " + colaborador );
        	System.out.println("\nCargo: Gerente" );
            System.out.println("\nSalário: R$ " +df.format( salario * ( 1.10 ) ));
        
            break;
        case 2: 
        	System.out.println("Nome do Colaborador: " + colaborador );
        	System.out.println("\nCargo: Vendedor" );
            System.out.println("\nSalário: R$ " + df.format(salario * ( 1.07 ) ));
        
            break;
        case 3: 
        	System.out.println("Nome do Colaborador :  " + colaborador );
        	System.out.println("\nCargo: Supervisor" );
            System.out.println("\nSalário: R$ " + df.format( salario * ( 1.09 )) );
        
            break;
        case 4: 
        	System.out.println("Nome do Colaborador: " + colaborador );
        	System.out.println("\nCargo:Motorista" );
            System.out.println("\nSalário: R$ " + df.format(salario * ( 1.06 )) );
        
            break;
        case 5: 
        	System.out.println("Nome do Colaborador: " + colaborador );
        	System.out.println("\nCargo:Estoquista" );
            System.out.println("\nSalário: R$ " +df.format( salario * ( 1.05 )) );
        
            break;
        case 6: 
        	System.out.println("Nome do Colaborador: " + colaborador );
        	System.out.println("\nCargo: Técnico de TI" );
            System.out.println("\nSalário: R$ " +df.format( salario * ( 1.08 )) );
        
            break;
        
        default:System.out.println("Opção Inválida");
        
        }
        
	}

}
