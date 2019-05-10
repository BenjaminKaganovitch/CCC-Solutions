/*
 * CCC 2019 Junior 4/Senior 1: Flipper
 * 
 * Author: Charles Chen
 * 
 * This problem involves a 2x2 matrix, and swapping the values of variables.
 * To solve this problem, declare a 2x2 array and set the values of the 
 * respective positions according to the problem. Then, loop through all the
 * characters and perform a horizontal flip is it is 'H' and perform a vertical
 * flip otherwise.
 * 
 * A horizontal flip is simply swapping the values of the top left and bottom
 * left and also swapping the values of the top right and bottom right. A
 * vertical flip is swapping the values of the top left and top right and also
 * swapping the values of the bottom left and bottom right.
 */

import java.util.Scanner;

public class Main {
	
	// Declaration of 2x2 Matrix
	public static int[][] original = new int[2][2];

	public static void main(String[] args) {
		
		// Initialize 2x2 Matrix
		original[0][0] = 1;
		original[0][1] = 2;
		original[1][0] = 3;
		original[1][1] = 4;
			
		// Input
		Scanner input = new Scanner(System.in);
		String flips = input.nextLine();
		input.close();
		
		// Perform Horizontal and Vertical Flips
		for (int i = 0; i < flips.length(); i++) {	
			if (flips.charAt(i) == 'H') {
				horizontalFlip();
			} else {
				verticalFlip();
			}
		}
		
		// Output
		System.out.println(original[0][0] + " " + original[0][1]);
		System.out.println(original[1][0] + " " + original[1][1]);
		
	}
	
	public static void horizontalFlip() {
		int temp = original[0][0];
		original[0][0] = original[1][0];
		original[1][0] = temp;
		
		temp = original[0][1];
		original[0][1] = original[1][1];
		original[1][1] = temp;	
	}
	
	public static void verticalFlip() {	
		int temp = original[0][0];
		original[0][0] = original[0][1];
		original[0][1] = temp;
		
		temp = original[1][0];
		original[1][0] = original[1][1];
		original[1][1] = temp;	
	}

}
