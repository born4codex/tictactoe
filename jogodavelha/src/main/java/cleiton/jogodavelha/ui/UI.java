package cleiton.jogodavelha.ui;

/* Classe criada para intera��o com a interface gr�fica, via console */

public class UI {
	
	void printText(String text) {
		System.out.println(text);
	}

	void printTextWithNoNewLine(String text) {
		System.out.print(text);
	}
	
	void printNewLine() {
		System.out.println();
	}
	
	void printGameTitle() {
		printText("=================");
		printText("/ JOGO DA VELHA /");
		printText("=================");
		printNewLine();
	}
}
