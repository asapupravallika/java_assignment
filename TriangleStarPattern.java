package com.codegnan.fundamentals;

import java.util.Scanner;

public class TriangleStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		//triangle-1
		// outer for loop is for rows
		for (int i = 1; i <= rows; i++) {
			//inner for loop is for columns
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				//System.out.print(i + " ");
				//System.out.print(j + " ");
				//System.out.print((rows-i) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//inverted triangle-1
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//triangle-2
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//inverted triangle-2
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
