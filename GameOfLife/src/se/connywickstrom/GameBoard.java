package se.connywickstrom;

import java.util.Arrays;
import java.util.Random;

public class GameBoard {
	
	private int w, h;
	
	private boolean current[][];
	private boolean future[][];

	
	
	public GameBoard() {
		this(20, 20);
	}
	
	public GameBoard(int width, int height) {
		this.w = width;
		this.h = height;
		
		current = new boolean[w][h];
		future = new boolean[w][h];
		
		this.initialize();
	}
	
	private void initialize() {
		// initialize each element on the current board with true or false in a random way.
		Random rand = new Random();
		
		for (int i = 0; i < current.length; i++) {
			for (int j = 0; j < current[i].length; j++) {
				current[i][j] = rand.nextBoolean();
			}
		}
	}
	
	public void iterate() {
		/*
		 * TODO: based on state in current update future according to these rules.
		 * - if a cell has exactly 3 neighbors it is borne
		 * - if a cell has more or less than 3 neighbors it dies
		 * set current = future
		 */
		
		
		for (int i = 0; i < current.length; i++) {
			for (int j = 0; j < current[i].length; j++) {
				int sum = 0;
				if (j > 0 && j < current[i].length-1) {
					for (int k = j-1; k <= j+1; k++) {
						if (i > 0 && i < current.length-1) {
							if (current[i-1][k]) {
								sum++;
							}
							if (current[i+1][k]) {
								sum++;
							}
						}
					}
				}
				if (j > 0 && j < current[i].length-1) {
					if (current[i][j-1]) {
						sum++;
					}
					if (current[i][j+1]) {
						sum++;
					}
				}

				if (sum == 3) {
					future[i][j] = true;
				} else {
					future[i][j] = false;
				}
					
				
			}
		}
		current = future;
		
	}

	@Override
	public String toString() {
		String output = new String();

		for (int i = 0; i < current.length; i++) {
			String line = new String();
			for (int j = 0; j < current[i].length; j++) {
				if (current[i][j]) {
					line += "*"; 
				} else {
					line += " ";
				}
				
			}
			output += line +"\n";
		}
		return output;
	}
}
