package contabancaria.controller;

import java.util.ArrayList;

import contabancaria.model.conta;
import contabancaria.repository.ContaRepository;

public class contacontroller implements ContaRepository {
	private ArrayList<conta> listaContas = new ArrayList<conta>();

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depoistar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeorDrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
public int gerarNumero() {
	
	return listaContas.size() +1;
}
}
