/*
 * CCC 2019 Junior 3: Cold Compress
 * 
 * Author: Charles Chen
 * 
 * In this problem, you must count the amount of times each character
 * shows up in a string in order and output it by printing the number 
 * of times it occurs followed by a space and the character itself. This 
 * is a compression technique known as run-length encoding.
 * 
 * The algorithm I used involves a nested for loop. The outer loop is used
 * to loop through all the strings while the inner loop is used to loop
 * through all the characters. If the next character is not equal to the
 * current character or if the inner loop has reached the end of a string,
 * it will print out the number of times it occurs using a counter variable
 * called "previousStop" followed by the character itself.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int previousStop = -1; // Variable used to track last time a different character was encountered
		
		// Input
		Scanner input = new Scanner(System.in);
		int numberOfLines = Integer.parseInt(input.nextLine());
		String[] sequences = new String[numberOfLines];
		
		for (int i = 0; i < numberOfLines; i++) {
			sequences[i] = input.nextLine();
		}
		input.close();
		
		// Data Process and Output
		for (int i = 0; i < numberOfLines; i++) {	
			for (int j = 0; j < sequences[i].length(); j++) {
				
				if (j < (sequences[i].length() - 1)) {
					if (sequences[i].charAt(j) != sequences[i].charAt(j+1)) {
						System.out.print(j - previousStop + " " + sequences[i].charAt(j) + " ");
						previousStop = j;	
					}			
				} else {			
					System.out.print(j - previousStop + " " + sequences[i].charAt(j));				
				}
				
			}
			System.out.println();
			previousStop = -1; // Reset counter for next string
		}
		
	}
	
}
