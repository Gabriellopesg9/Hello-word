package contabancaria.repository;

import contabancaria.model.conta;

public interface ContaRepository {
	//CRUD da Conta
public void procurarPorNumero(int numero);
public void listarTodas();
public void cadastrar(conta conta);
public void atualizar(conta conta);
public void deletar(int numero);
   //Método Bancários
public void sacar(int numero , float valor );
public void depositar(int numero, float valor);
public void transferir(int numeorDrigem, int numeroDestino,float valor);
}
