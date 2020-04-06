/*
 * CCC 2019 Senior 2: Pretty Average Primes
 * 
 * Author: Charles Chen
 * 
 * This problem involves finding 2 prime numbers, A and B, such that 
 * N is the average of A and B. Mathematically, we can express this as 
 * N = (A + B) / 2. Notice how we can rearrange this equation to 
 * 2N = A + B.
 * 
 * To solve this, we will construct a method to determine if a given
 * number is prime. For improved efficiency, you only need to check
 * up to the square root of the given number to determine if it is 
 * prime or not. 
 * 
 * We will use a loop variable j which starts at 2 in order to find
 * A and B which have a sum of 2N. If we find a j that is prime and
 * we see that (2N - j) is also prime, we have found our A and B.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Input
		Scanner in = new Scanner(System.in);
		int numLines = Integer.parseInt(in.nextLine());
		int[] numbers = new int[numLines];
		
		for (int i = 0; i < numLines; i++) {
			numbers[i] = Integer.parseInt(in.nextLine());
		}
		in.close();
		
		// Output
		int doubled = 0;
		for (int i = 0; i < numLines; i++) {
			doubled = numbers[i] * 2;
			for (int j = 2; j < doubled; j++) {
				if (isPrime(j) && isPrime(doubled - j)) {
					System.out.println(j + " " + (doubled - j));
					break;
				}
			}
		}

	}
	
	// Method used to check if a number is prime
	public static boolean isPrime(int n) {
		int max = (int) Math.sqrt(n);
		
		for (int i = 2; i <= max; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
