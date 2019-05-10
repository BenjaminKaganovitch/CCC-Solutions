/*
 * CCC 2019 Junior 1: Winning Score
 * 
 * Author: Charles Chen
 *
 * Straight forward calculation and else if structure
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		int apple3 = input.nextInt();
		int apple2 = input.nextInt();
		int apple1 = input.nextInt();
		int banana3 = input.nextInt();
		int banana2 = input.nextInt();
		int banana1 = input.nextInt();
		input.close();
		
		// Data process
		int appleScore = (3 * apple3) + (2 * apple2) + (1 * apple1);
		int bananaScore = (3 * banana3) + (2 * banana2) + (1 * banana1);
		
		// Output
		if (appleScore > bananaScore) {
			System.out.println("A");
		} else if (bananaScore > appleScore) {
			System.out.println("B");
		} else {
			System.out.println("T");
		}

	}

}
