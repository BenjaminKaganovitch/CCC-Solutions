/*
 * CCC 2018 Junior 1: Telemarketer or not?
 * 
 * Author: Charles Chen
 * 
 * Simple if statement
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Input
		Scanner input = new Scanner(System.in);
		int digit1 = input.nextInt();
		int digit2 = input.nextInt();
		int digit3 = input.nextInt();
		int digit4 = input.nextInt();
		input.close();
		
		// Solution
		if ((digit1 == 8 || digit1 == 9) && (digit2 == digit3) && (digit4 == 8 || digit4 == 9)) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}

	}

}
