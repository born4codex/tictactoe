package cleiton.jogodavelha.core;

import cleiton.jogodavelha.Constants;
import cleiton.jogodavelha.ui.UI;

public class Game {
	
	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		
		
		UI.printGameTitle();
		
		board.clear();
		board.print();
		
		//UI.readInput("Nome do jogador: ");
	
	
	}

}
