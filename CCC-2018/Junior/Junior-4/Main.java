/*
 * CCC 2018 Junior 4/Senior 2: Sunflowers
 * 
 * Author: Charles Chen
 * 
 * If you look carefully, you will notice that in any correct
 * table, the top left corner always contains the smallest number.
 * You can solve this problem by first locating the smallest number
 * by searching all 4 corners and then "rotating" the table back to
 * the correct position depending on which corner the smallest number
 * is located.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		int flowers = Integer.parseInt(input.nextLine());
		int[][] measurements = new int[flowers][flowers];
		for (int i = 0; i < flowers; i++) {
			for (int j = 0; j < flowers; j++) {
				measurements[i][j] = input.nextInt();
			}
		}
		input.close();
		
		// Find location of smallest number
		int minNumber = measurements[0][0];
		int row = 0;
		int column = 0;
			
		if (measurements[0][flowers-1] < minNumber) {
			row = 0;
			column = flowers - 1;
			minNumber = measurements[0][flowers-1];
		} 		
		if (measurements[flowers-1][0] < minNumber) {
			row = flowers - 1;
			column = 0;
			minNumber = measurements[flowers-1][0];
		} 		
		if (measurements[flowers-1][flowers-1] < minNumber) {
			row = flowers - 1;
			column = flowers - 1;
			minNumber = measurements[flowers-1][flowers-1];
		}
		
		// Print Original Table
		if (row == 0 && column == 0) { // Normal Table (Flip 0 Degrees)
			for (int i = 0; i < flowers; i++) {
				for (int j = 0; j < flowers; j++) {
					System.out.print(measurements[i][j] + " ");
				}
				System.out.println();
			}
		} else if (row == 0 && column > 0) { // Flip 90 Degrees CCW
			for (int i = flowers - 1; i >= 0; i--) {
				for (int j = 0; j < flowers; j++) {
					System.out.print(measurements[j][i] + " ");
				}
				System.out.println();
			}
		} else if (row > 0 && column > 0) { // Flip 180 Degrees CW/CCW
			for (int i = flowers - 1; i >= 0; i--) {
				for (int j = flowers - 1; j >= 0; j--) {
					System.out.print(measurements[i][j] + " ");
				}
				System.out.println();
			}
		} else { // Flip 90 Degrees CW (270 Degrees CCW)
			for (int i = 0; i < flowers; i++) {
				for (int j = flowers - 1; j >= 0 ; j--) {
					System.out.print(measurements[j][i] + " ");
				}
				System.out.println();
			}
		}

	}

}
