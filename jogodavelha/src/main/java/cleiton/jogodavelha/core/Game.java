package cleiton.jogodavelha.core;

import cleiton.jogodavelha.Constants;
import cleiton.jogodavelha.ui.UI;

public class Game {
	
	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		
		
		UI.printGameTitle();
		
		
		board.print();
		
		//UI.readInput("Nome do jogador: ");
	
	
	}

}
