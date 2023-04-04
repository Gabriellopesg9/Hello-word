package devpizzzaideias.model;

public class Devpizzaideias {
	private int tamanho ;
	private int sabor ;
	private int borda ;
	private int bebida ;
	private float valor;
	public Devpizzaideias(int tamanho, int sabor, int borda, int bebida,float valor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.borda = borda;
		this.bebida = bebida;
		this.valor = valor ;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getSabor() {
		return sabor;
	}
	public void setSabor(int sabor) {
		this.sabor = sabor;
	}
	public int getBorda() {
		return borda;
	}
	public void setBorda(int borda) {
		this.borda = borda;
	}
	public int getBebida() {
		return bebida;
	}
	public void setBebida(int bebida) {
		this.bebida = bebida;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void valorfinal(float valoritem ) {
		this.setValor(this.getValor() + valor);
		
	}
	
	public void visualizar() {

		String tamanho = "";
		
		switch(this.tamanho) {
		case 1:
			tamanho = "Pequena";
		break;
		case 2:
			tamanho= "Média";
		break;
		
		
		case 3: 
			tamanho ="Grande";
			break;
		}
	
		

			String sabor = "";
			
			switch(this.sabor) {
			case 1:
				sabor = "frango";
			break;
			case 2:
				sabor = "calabresa";
			break;
			
			
			case 3: 
				sabor ="quieijo";
				break;
			}
		
			
			

				String borda = "";
				
				switch(this.borda) {
				case 1:
					borda = "catupiry";
				break;
				case 2:
				    borda = "cheddar";
				break;
				
				
				case 3: 
					borda ="chocolate";
					break;
				}
			
				

					String bebida = "";
					
					switch(this.bebida) {
					case 1:
						bebida  = "refri";
					break;
					case 2:
						bebida = "suco";
					break;
					
					
					case 3: 
						bebida  ="del vale";
						break;
					}
				
				
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Venda:");
		System.out.println("***********************************************************");
		System.out.println("Tamanho da Pizza: " + tamanho);
		System.out.println("Sabor da Pizza: " + sabor);
		System.out.println("Borda : " + borda);
		System.out.println("Bebida : " + bebida);
		System.out.println("Valor Total: " + this.valor);
				

	}
	
	
}

