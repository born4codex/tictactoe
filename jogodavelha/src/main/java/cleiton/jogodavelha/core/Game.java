package cleiton.jogodavelha.core;

import cleiton.jogodavelha.Constants;
import cleiton.jogodavelha.ui.UI;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];

	public void play() {

		UI.printGameTitle();

		for (int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);

		}

	}

	private Player createPlayer(int index) {
		String name = UI.readInput("Jogador " + (index + 1) + "=>");
		char symbol = Constants.SYMBOL_PLAYERS[index];
		Player player = new Player(name, symbol, board);

		UI.printText("O jogador '" + name + "' vai usar o simbolo '" + symbol + "'");

		return player;
	}

	private Player nextPlayer() {
		/*
		 * currentPlayerIndex++;
		 * 
		 * if(currentPlayerIndex >= players.length) { currentPlayerIndex = 0; }
		 */

		currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
		return players[currentPlayerIndex];
	}

}
