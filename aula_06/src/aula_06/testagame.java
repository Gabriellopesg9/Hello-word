package aula_06;

import java.time.LocalDate;

public class testagame {

	public static void main(String[] args) {
		
			
			LocalDate data = LocalDate.of(2020, 9, 20);
			
			produto g1 = new produto(1, "Valorant", 1, "Riot Games", data, 1200.0f);

			g1.visualizar();
			
		
	}

}
