package cleiton.jogodavelha.core;

import cleiton.jogodavelha.Constants;
import cleiton.jogodavelha.ui.UI;

public class Board {
	
	char [] [] matrix; 
	
	public Board() {    /*Criando construtor */
		matrix = new char [Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();
	
	}
	
	
	public void clear() { /* Limpa o tabuleiro paro o start do jogo */
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
		
		
	}
	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));/*Convertendo char em String*/
				
			if (j < matrix[i].length - 1) {	
				UI.printTextWithNoNewLine(" | ");
			}
		}
			UI.printNewLine();
			
			if (i < matrix.length -1) { 
		    UI.printText("----------");
		  }
		}
	}
	
	public boolean isFull() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ' ') {
				return false; //Depois corrigir retrno deste metodo
				}
			}
		}
		return true;
	}
	
	 public boolean play(Player player, Move move) {
		 int i = move.i;
		 int j = move.j;
		
		 matrix[i][j] = player.symbol;
		 
		 //TODO  Checar se o jogador ganhou
		 return false;
		
	}
	

}
