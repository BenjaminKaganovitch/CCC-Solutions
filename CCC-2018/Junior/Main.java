/*
 * CCC 2018 Junior 3: Are we there yet?
 * 
 * Author: Charles Chen
 * 
 * Arrays and calculations
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] distances = new int[4];
		int[] cityPositions = new int[5];
		cityPositions[0] = 0;

		// Input
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {	
			distances[i] = input.nextInt();
		}
		input.close();
		
		// Calculate Positions of Cities
		for (int i = 1; i < 5; i++) {
			cityPositions[i] = cityPositions[i-1] + distances[i-1];
		}
		
		// Loop Through the Cities and Calculate Distance
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int distance = cityPositions[j] - cityPositions[i];
				if (distance < 0) distance = distance * -1; // Ensuring result is positive
				System.out.print(distance + " ");
			}
			System.out.println();
		}
		
	}

}
