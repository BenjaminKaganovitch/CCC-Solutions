/*
 * CCC 2021 Senior 1: Crazy Fencing
 * 
 * Author: Charles Chen
 * 
 * Calculate area of trapezoids using provided formula
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double totalArea = 0;
		
		// Input
		Scanner input = new Scanner(System.in);
		int numFences = Integer.parseInt(input.nextLine());
		
		int[] heights = new int[numFences + 1];
		int[] widths = new int[numFences];
		
		String[] heightInput = input.nextLine().split(" ");
		for (int i = 0; i < numFences + 1; i++) {
			heights[i] = Integer.parseInt(heightInput[i]);
		}
		
		String[] widthInput = input.nextLine().split(" ");
		for (int i = 0; i < numFences; i++) {
			widths[i] = Integer.parseInt(widthInput[i]);
		}
		input.close();
		
		// Calculate total area
		for (int i = 0; i < numFences; i++) {
			totalArea += ((heights[i] + heights[i + 1]) * widths[i]) / 2.0;
		}
		
		// Output
		System.out.println(totalArea);
	}

}
