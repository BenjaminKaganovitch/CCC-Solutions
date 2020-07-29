/*
 * CCC 2020 Junior 2: Epidemiology
 * 
 * Cited directly from the problem: "This problem was designed before the current coronavirus 
 * outbreak, and we acknowledge the distress currently being experienced by many people worldwide 
 * because of this and other diseases. We hope that including this problem at this time highlights 
 * the important roles that computer science and mathematics play in solving real-world problems."
 * 
 * Author: Charles Chen
 * 
 * Calculations and looping
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int day = 0;
		
		Scanner input = new Scanner(System.in);
		int target = Integer.parseInt(input.nextLine());
		int initial = Integer.parseInt(input.nextLine());
		int spread = Integer.parseInt(input.nextLine());
		input.close();
		
		int totalInfected = initial;
		
		if (initial == target) {
			System.out.println(1);
		} else {
			while (totalInfected <= target) {
				day++;
				totalInfected += (Math.pow(spread, day) * initial);
			}
			System.out.println(day);
		}

	}

}
