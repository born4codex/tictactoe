package cleiton.jogodavelha.core;

import cleiton.jogodavelha.ui.UI;

public class Player {

	private String name;
	private char symbol;
	private Board board;

	public Player(String name, char symbol, Board board) {
		this.name = name;
		this.symbol = symbol;
		this.board = board;
	}

	private Move inputMove() throws InvalidMoveException {
		String moveStr = UI.readInput("Jogador '" + name + "' =>");
		return new Move(moveStr);

	}

	public boolean play() throws InvalidMoveException {
		Move move = inputMove();
		return board.play(this, move);

	}

	public String getName() {
		return name;
	}

	public char getSymbol() {
		return symbol;
	}

	public Board getBoard() {
		return board;
	}

}
