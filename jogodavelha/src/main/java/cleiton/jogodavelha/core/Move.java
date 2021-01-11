package cleiton.jogodavelha.core;

public class Move {

	private int i;
	private int j; // Necessario verificar o pq dessa classes usarem variaveis I e J, pois
					// profissionalmente
	// qual nomenclarutra que � usada;

	public int getI() {
		return i;

	}

	public Move(String moveStr) throws InvalidMoveException {
		// 0,0
		// Desmesbrando String e inserindo em um array de tokens(peda�os da String)
		// Ex: Qdo usuario digitar 1,2 ficara assim no array [ "1" "2" ]
		// posi��o 0 do array com valor 1 e posi��o 1 com valor 2
		try {
			String[] tokens = moveStr.split(",");

			this.i = Integer.parseInt(tokens[0]);
			this.j = Integer.parseInt(tokens[1]);

		} catch (Exception e) {

			throw new InvalidMoveException("A jogada é inválida");

		}

	}

	public int getJ() {
		return j;
	}

}
