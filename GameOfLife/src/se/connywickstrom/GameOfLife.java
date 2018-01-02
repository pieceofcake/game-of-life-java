package se.connywickstrom;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameOfLife {

	public static void main(String[] args) {
		final int GAME_WIDTH = 25;
		final int GAME_HEIGHT = 25;
		
		GameBoard gb = new GameBoard(GAME_WIDTH, GAME_HEIGHT);
		//gb.print();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(gb);
			gb.iterate();
		}
		
		
		//new GameWindow(GAME_WIDTH, GAME_HEIGHT);
		
	}

}
