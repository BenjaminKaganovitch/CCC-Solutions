/*
 * CCC 2020 Junior 4: Cyclic Shifts
 * 
 * Author: Charles Chen
 * 
 * String methods
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean containsShift = false;
		
		// Input
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String shift = input.nextLine();
		input.close();
		
		// Find shifts
		for (int i = 0; i < shift.length(); i++) {
			if (text.contains(shiftText(shift, i))) {
				containsShift = true;
				break;
			}
		}
		
		// Output
		if (containsShift) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
	
	public static String shiftText(String s, int cut) {
		
		String s1 = s.substring(0, cut);
		String s2 = s.substring(cut);
		
		return s2 + s1;
		
	}

}
