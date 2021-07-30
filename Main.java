/*
 * CCC 2021 Junior 1: Boiling Water
 * 
 * Author: Charles Chen
 * 
 * Calculation and if statement
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int pressure = 0;
		int temperature = 0;
		
		// Input
		Scanner input = new Scanner(System.in);
		temperature = Integer.parseInt(input.nextLine());
		input.close();
		
		// Calculate pressure
		pressure = 5 * temperature - 400;
		System.out.println(pressure);
		
		// Determine location relative to sea level
		if (pressure > 100) { // Below sea level
			System.out.println(-1);
		} else if (pressure == 100) { // At sea level
			System.out.println(0);
		} else { // In this case, pressure < 100 and it is above sea level
			System.out.println(1);
		}

	}

}
