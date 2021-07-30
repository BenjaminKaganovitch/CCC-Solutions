/*
 * CCC 2021 Junior 2: Silent Auction
 * 
 * Author: Charles Chen
 * 
 * Find max value
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numBids = 0;
		int maxIndex = -1;
		int max = Integer.MIN_VALUE;
		
		// Input
		Scanner input = new Scanner(System.in);
		numBids = Integer.parseInt(input.nextLine());
		
		String[] names = new String[numBids];
		int[] bidAmounts = new int[numBids];
		
		// Input bids, while also checking if the bid amount is the max
		for (int i = 0; i < numBids; i++) {
			names[i] = input.nextLine();
			bidAmounts[i] = Integer.parseInt(input.nextLine());
			
			if (bidAmounts[i] > max) { // This will find the first max int
				max = bidAmounts[i];
				maxIndex = i;
			}
		}
		input.close();
		
		// Output winner
		System.out.println(names[maxIndex]);

	}

}
