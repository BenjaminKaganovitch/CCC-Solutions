/*
 * CCC 2018 Junior 2: Occupy parking
 * 
 * Author: Charles Chen
 * 
 * String index checking
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		int parkingSpaces = Integer.parseInt(input.nextLine());
		String yesterday = input.nextLine();
		String today = input.nextLine();
		input.close();
		
		int counter = 0; // Counter used to count parking spaces occupied both days
		
		// Loop through both strings
		for (int i = 0; i < parkingSpaces; i++) {			
			if (yesterday.charAt(i) == today.charAt(i) && today.charAt(i) == 'C') {
				counter++;
			}			
		}
		
		System.out.println(counter);

	}

}
