package se.connywickstrom;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

	public static final int BOARD_SIZE = 100;
	public static final int SQUARE_SIZE = 10;
	
	private int width;
	private int height; 
	private int boardSize;
		
	public GameWindow(int width, int height) {
		super("Game of Life");
		this.width = width;
		this.height = height;
		this.boardSize = width * height;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel gameArea = new JPanel(new GridLayout(this.width, this.height));
		
		for (int i = 0; i < boardSize; i++) {
			JLabel b = new JLabel("*");
			
			gameArea.add(b);
		}
		
		
		getContentPane().add(gameArea);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
