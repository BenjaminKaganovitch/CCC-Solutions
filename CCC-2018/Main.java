/*
 * CCC 2018 Senior 1: Voronoi Villages
 * 
 * Author: Charles Chen
 * 
 * Arrays and calculations
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Initialize Variables
		double minSize = Integer.MAX_VALUE;
		double sizeLeft = 0;
		double sizeRight = 0;
		double totalSize = 0;
		
		// Input
		Scanner input = new Scanner(System.in);
		int numVillages = Integer.parseInt(input.nextLine());
		int[] points = new int[numVillages];
		for (int i = 0; i < numVillages; i++) points[i] = input.nextInt();
		input.close();
		
		Arrays.sort(points); // Sort the points
		
		for (int i = 1; i < numVillages - 1; i++) {
			int differenceLeft = points[i] - points[i-1];
			int differenceRight = points[i+1] - points[i];
			sizeLeft = (double) differenceLeft / 2;
			sizeRight = (double) differenceRight / 2;
			
			totalSize = sizeLeft + sizeRight;
			if (totalSize < minSize) {
				minSize = totalSize;
			}
		}
		
		System.out.println(String.format("%.1f", minSize));
		
	}

}
