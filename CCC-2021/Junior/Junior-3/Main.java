/*
 * CCC 2021 Junior 3: Secret Instructions
 * 
 * Author: Charles Chen
 * 
 * While loops, String methods, even or odd
 */

import java.util.Scanner;

public class Main {
	
	public static String previous = "";

	public static void main(String[] args) {
		
		String instruction = "";
		Scanner input = new Scanner(System.in);
		
		// Loop through input and break at 99999
		while (true) {
			instruction = input.nextLine();
			if (instruction.equals("99999")) {
				break;
			}
			
			System.out.println(direction(instruction) + " " + instruction.substring(2));
		}
		input.close();
		
	}
	
	public static String direction(String instruc) {
		
		String num = instruc.substring(0, 2);
		int sum = Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(num.substring(1));
		
		if (sum == 0) {
			return previous;
		} else if (sum % 2 == 0) {
			previous = "right";
			return "right";
		} else { // sum is odd
			previous = "left";
			return "left";
		}
		
	}

}
