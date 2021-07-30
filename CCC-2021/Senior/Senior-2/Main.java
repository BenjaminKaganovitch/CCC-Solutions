/*
 * CCC 2021 Junior 5/Senior 2: Modern Art
 * 
 * Author: Charles Chen
 * 
 * The obvious solution for this problem would be to read each swipe, perform it, and
 * then count the number of gold cells. This is, however, too slow for 15/15 marks.
 * 
 * To optimize this solution, you have to notice two key things:
 * 1) The order in which the swipes are performed doesn't matter
 * 2) Duplicate swipes can be removed (don't need to be performed)
 * 
 * Given this, we will create 2 boolean arrays that will represent which rows and columns
 * need to be swiped. We will read in which rows and columns need to be swiped and negate
 * the value in the proper index using the ! operator. Using the NOT operator in multiples
 * of 2 returns the value back to false, which indicates that the row does not need to be
 * swiped, taking advantage of observation 2). If the value at any index ends up as true,
 * then that means that row/column needs to be swiped.
 * 
 * We will represent the canvas using a 2D boolean array, where false represents a
 * black cell and true represents a gold cell. We will then loop through the arrays
 * indicating which rows and columns need to be swiped and perform the necessary swipes.
 * The order that we perform the swipes in doesn't matter because of observation 1).
 * 
 * Finally, loop through the entire 2D array and count the number of true values, which
 * represents the number of gold cells.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// Input
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(input.readLine());
		int cols = Integer.parseInt(input.readLine());
		int numLines = Integer.parseInt(input.readLine());
		
		boolean[] rowSwipes = new boolean[rows + 1];
		boolean[] colSwipes = new boolean[cols + 1];
		
		for (int i = 0; i < numLines; i++) {
			String[] lineInfo = input.readLine().split(" ");
			int index = Integer.parseInt(lineInfo[1]);
			if (lineInfo[0].equals("R")) {
				rowSwipes[index] = !rowSwipes[index];
			} else {
				colSwipes[index] = !colSwipes[index];
			}
		}
		input.close();
		
		boolean[][] canvas = new boolean[rows + 1][cols + 1];
		
		// Go through brush swipes, starting with rows
		for (int i = 1; i <= rows; i++) {
			if (rowSwipes[i]) {
				for (int j = 1; j <= cols; j++) {
					canvas[i][j] = !canvas[i][j];
				}
			}
		}
		
		// Go through column swipes
		for (int i = 1; i <= cols; i++) {
			if (colSwipes[i]) {
				for (int j = 1; j <= rows; j++) {
					canvas[j][i] = !canvas[j][i];
				}
			}
		}
		
		// Count gold cells
		int goldCount = 0;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if (canvas[i][j]) {
					goldCount++;
				}
			}
		}
		
		// Output gold count
		System.out.println(goldCount);
	}
	
}
