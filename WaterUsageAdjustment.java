package com.codegnan.fundamentals;

import java.util.Scanner;

public class WaterUsageAdjustment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Step-1: read number of stations(N) and number of queries(Q)
		int numberOfStations = scanner.nextInt();
		int numberOfQueries = scanner.nextInt();
		
		// Step-2: read initial water usage of each station
		int[] waterUsage = new int[numberOfStations];
		for(int i=0;i<numberOfStations;i++) {
			waterUsage[i] = scanner.nextInt();
		}
		
		// Step-3: process each query adjustment 
		for(int i=0;i<numberOfQueries;i++) {
			int startStation = scanner.nextInt(); //1-based index
			int endStation = scanner.nextInt(); //1-based index
			int adjustments = scanner.nextInt(); //positive or negative
			
			//apply adjustment of all stations in the range[L,R]
			for(int j=startStation-1;j<endStation;j++) {
				waterUsage[j] += adjustments;
				if(waterUsage[j]<0) {
					waterUsage[j]=0;
				}
			}
		}
		// Step-4: Display the final water usage of all stations
		for(int i=0;i<numberOfStations;i++) {
			System.out.print(waterUsage[i]); //or (waterUsage[i]+" ")
			if(i<numberOfStations - 1) {
				System.out.print(" ");
			}
		}
		scanner.close();
	}

}
