/*
 * CCC 2019 Junior 2: Time to Decompress
 * 
 * Author: Charles Chen
 * 
 * Strings and loops
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Input Number of Lines
		Scanner input = new Scanner(System.in);
		int numberOfLines = input.nextInt();
		
		// Declaration of Arrays
		int[] numberOfSymbols = new int[numberOfLines];
		String[] symbolType = new String[numberOfLines];
		
		// Input Numbers and Symbols
		for (int i = 0; i < numberOfLines; i++) {		
			numberOfSymbols[i] = input.nextInt();
			symbolType[i] = input.nextLine();
			symbolType[i] = symbolType[i].strip();			
		}
		input.close();
		
		// Output
		for (int i = 0; i < numberOfLines; i++) {		
			for (int j = 0; j < numberOfSymbols[i]; j++) {
				System.out.print(symbolType[i]);
			}
			System.out.println();		
		}

	}

}
