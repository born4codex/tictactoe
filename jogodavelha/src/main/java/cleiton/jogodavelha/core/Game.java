package cleiton.jogodavelha.core;

import cleiton.jogodavelha.Constants;
import cleiton.jogodavelha.ui.UI;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];

	public void play() {

		UI.printGameTitle();

		for (int i = 0; i < players.length; i++) {
			player[i] = createPlayer(i);

		}

	}

	private Player createPlayer(int index) {
		String name = UI.readInput("Jogador " + (index + 1) + "=>"); 
		char symbol = Constants.SYMBOL_PLAYERS[index]
		Player player = new Player(name, board, symbol);

		UI.printText("O jogador '" + name + "' vai usar o símbolo '" + symbol + "'");

		return player;
	}

}
