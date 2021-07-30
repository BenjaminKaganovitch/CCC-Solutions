/*
 * CCC 2021 Senior 3: Lunch Concert
 * 
 * Author: Charles Chen
 * 
 * The obvious way to approach this problem would be to loop through each possible location
 * to hold the concert and to calculate the total walking time for each position. Afterwards,
 * you can pick out the smallest walking time. However, this solution is too inefficient to
 * receive all 15/15 marks.
 * 
 * Let's optimize this approach. The first idea to consider is placing an upper and lower
 * bound on the possible locations to hold the concert. The logical lower bound would be
 * the smallest position of all the friends and the logical upper bound would be the largest
 * position of all the friends. This makes sense because when you have more than one friend,
 * you should hold the concert somewhere in the middle of all of them to minimize walking
 * time. When you have 1 friend, it makes the most logical sense to hold the concert at their
 * current location.
 * 
 * How can we reduce the possible locations even further? When you take the sample inputs and 
 * write a program to output the total walking time at each possible location for the concert,
 * bounded by the upper and lower bounds, you will notice that the total walking times at each
 * extreme are large, but they get smaller as you observe points closer to the center. If you 
 * were to graph the walking times at each of the positions, the graph would have a shape 
 * similar to a "U".
 * 
 * Given this, the problem essentially becomes a peak finding problem. We must find a position
 * c where the walking times on both sides are greater than or equal to the walking time at c.
 * Using a divide and conquer approach, we can continually halve the number of possible
 * locations for c. This approach is a lot more efficient and will give us 15/15 marks.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Initialize Variables
		int minPos = Integer.MAX_VALUE;
		int maxPos = Integer.MIN_VALUE;
		long minTime = -1;
		
		// Input
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int numFriends = Integer.parseInt(input.readLine());
		
		int[] positions = new int[numFriends];
		int[] speeds = new int[numFriends];
		int[] maxDistances = new int[numFriends];
		
		for (int i = 0; i < numFriends; i++) {
			String[] values = input.readLine().split(" ");
			positions[i] = Integer.parseInt(values[0]);
			speeds[i] = Integer.parseInt(values[1]);
			maxDistances[i] = Integer.parseInt(values[2]);
			
			if (positions[i] < minPos) {
				minPos = positions[i];
			}
			
			if (positions[i] > maxPos) {
				maxPos = positions[i];
			}
		}
		input.close();
		
		// Use a divide and conquer approach to find c
		int left = minPos;
		int right = maxPos;
		while (left <= right) {
			int mid = (left + right) / 2;
			long midTime = calculateTime(positions, speeds, maxDistances, mid);
			long midRightTime = calculateTime(positions, speeds, maxDistances, mid+1);
			long midLeftTime = calculateTime(positions, speeds, maxDistances, mid-1);
			
			if (midTime <= midRightTime && midTime <= midLeftTime) {
				minTime = midTime;
				break;
			} else if (midTime <= midRightTime) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		// Output minTime
		System.out.println(minTime);
		
	}
	
	public static long calculateTime(int[] pos, int[] sp, int[] dist, int concert) {
		long totalTime = 0;
		
		for (int i = 0; i < pos.length; i++) {
			int totalDistance = Math.abs(concert - pos[i]);
			
			if (totalDistance > dist[i]) {
				long minTravel = totalDistance - dist[i];
				totalTime += minTravel * sp[i];
			}
			
		}
		return totalTime;
	}

}
