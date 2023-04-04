package contabancaria.controller;

import java.util.ArrayList;

import contabancaria.model.conta;
import contabancaria.repository.ContaRepository;

public class contacontroller implements ContaRepository {
	private ArrayList<conta> listaContas = new ArrayList<conta>();

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNacollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A conta não foi encontrada!");

		
	}

	@Override
	public void listarTodas() {
		for (var conta:listaContas) {
			
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(conta conta) {
		listaContas.add(conta);
		System.out.println("\na Conta número: "+ conta.getNumero()+" foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(conta conta) {

		var buscaConta = buscarNacollection(conta.getNumero());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("Os dados da Conta foram atualizados com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");

		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNacollection(numero);

		if (conta != null) {
			if(listaContas.remove(conta) == true)
				System.out.println("A Conta foi excluída!");
		}else
			System.out.println("A conta não foi encontrada!");

		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNacollection(numero);

		if (conta != null) {
			if(conta.sacar(valor) == true)
				System.out.println("O Saque foi efetuado com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");

		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNacollection(numero);

		if (conta != null) {
			conta.depositar(valor);
				System.out.println("O Depósito foi efetuado com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNacollection(numeroOrigem);
		var contaDestino = buscarNacollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if(contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("A Transferência foi efetuada com sucesso!");
			}
		}else
			System.out.println("A conta não foi encontrada!");
		
	}
public int gerarNumero() {
	
	return listaContas.size() +1;
}
public conta buscarNacollection (int numero  ) {
	for (var conta : listaContas ) {
		if(conta.getNumero() == numero) {
			return conta ;
		}
	}
	return null ;
}
public void procurarPoNumero(int numero) {
	
	var conta =buscarNacollection(numero);
	if(conta!=null)
		conta.visualizar();
	else 
		System.out.println("\nA Conta número "+ numero +" não foi encontrada!");
}
public int retornaTipo(int numero) {
	for (var conta : listaContas) {
		if (conta.getNumero() == numero) {
			return conta.getTipo();
		}
	}

	return 0;
}
}
