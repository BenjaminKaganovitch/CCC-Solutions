/*
 * CCC 2021 Junior 4: Arranging Books
 * 
 * Author: Charles Chen
 * 
 * This solution is inspired by a formula described by Aaron He on YouTube. The
 * formula is:
 * 
 * minSwaps = (# misplaced books in L) + (# misplaced books in M) 
 * - MIN((# of M books in L), (# of L books in M))
 * 
 * For the reasoning behind this formula and solution, see Aaron's video describing
 * the solution to this problem: https://youtu.be/rBeIOwfwKSI
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Initialize variables
		int numL = 0; // # of large books
		int numM = 0; // # of medium books
		int misplacedL = 0; // # of misplaced books in L section
		int misplacedM = 0; // # of misplaced books in M section
		int mInL = 0; // # of M books in L section
		int lInM = 0; // # of L books in M section
		
		// Input
		Scanner input = new Scanner(System.in);
		char[] shelf = input.nextLine().toCharArray();
		input.close();
		
		// Count the number of large and medium books
		for (int i = 0; i < shelf.length; i++) {
			if (shelf[i] == 'L') {
				numL++;
			} else if (shelf[i] == 'M') {
				numM++;
			}
		}
		
		// Count # of misplaced books & # of M in large section
		for (int i = 0; i < numL; i++) {
			if (shelf[i] == 'M') {
				mInL++;
				misplacedL++;
			} else if (shelf[i] == 'S') {
				misplacedL++;
			}
		}
		
		// Count # of misplaced books & # of L in medium section
		for (int i = numL; i < numL + numM; i++) {
			if (shelf[i] == 'L') {
				lInM++;
				misplacedM++;
			} else if (shelf[i] == 'S') {
				misplacedM++;
			}
		}
		
		// Output minimum swaps
		System.out.println(misplacedL + misplacedM - Math.min(mInL, lInM));
	}

}
