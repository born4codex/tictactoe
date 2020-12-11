
package cleiton.jogodavelha.ui;

import br.com.softblue.commons.io.Console;

/* Classe criada para intera��o com a interface gr�fica, via console */

public class UI {
	
	public static void printText(String text) {
		System.out.println(text);
	}

	public static void printTextWithNoNewLine(String text) {
		System.out.print(text);
	}
	
	public static void printNewLine() {
		System.out.println();
	}
	
	public static void printGameTitle() {
		printText("=================");
		printText("/ JOGO DA VELHA /");
		printText("=================");
		printNewLine();
	}
	
	public static String readInput(String text) {
		printTextWithNoNewLine(text + " ");
		return Console.readString();
		
	}
}
