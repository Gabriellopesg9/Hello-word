package devpizzzaideias.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

import devpizzzaideias.model.Devpizzaideias;
import devpizzzaideias.repository.DevpizzaideiaRepository;

public class DevpizzaideiasCotroller implements DevpizzaideiaRepository{
	 
	private ArrayList<Devpizzaideias> faturamentodiario = new ArrayList<Devpizzaideias>();
    
	@Override
	public void faturamentodiariao() {
		for (var conta : faturamentodiario) {
			    conta.visualizar();
		
		}
	}

	@Override
	public void faturamentosemanal() {
		// TODO Auto-generated method stub 
		}

	@Override
	public void faturamentomensal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faturamentoanual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarpedido(Devpizzaideias pedido) {
		faturamentodiario.add(pedido);
		System.out.println("Pedido Cadastrado!");
		
	}

}
