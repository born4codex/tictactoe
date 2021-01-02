package cleiton.jogodavelha.core;

public class Move {
	
	private int i;
	private int j; // Necessario verificar o pq dessa classes usarem variaveis I e J, pois profissionalmente
	       //qual nomenclarutra que é usada;
	
	
	
	
	
	public int getI() {
		return i;
		
	}
	
	public Move(String moveStr) {
			// 0,0
		    //Desmesbrando String e inserindo em um array de tokens(pedaços da String)
			//Ex: Qdo usuario digitar 1,2 ficara assim no array [ "1" "2" ]
			//posição 0 do array com valor 1 e posição 1 com valor 2
			String[] tokens = moveStr.split(",");
			
			this.i = Integer.parseInt(tokens[0]);
			this.j = Integer.parseInt(tokens[1]);
			
			//TODO validar se a estrutura do moveStr esta correta
		}

	public int getJ() {
		return j;
	}
	

}
