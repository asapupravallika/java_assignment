package com.codegnan.fundamentals;

import java.util.Scanner;

public class RhombusPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Rhombus
		System.out.println("Enter Rhombus side:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        
        //Palindrome Pattern 
        System.out.println("Enter number of rows in a Palindrome pattern:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
            System.out.print(j + " ");
            }

            System.out.println();
            }
        System.out.println();
        
        //Number triangle
        System.out.println("Enter Triangle side:");
        int row = sc.nextInt();
        int count = 1;
        for(int i=1;i<=row;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(count + " ");
        		count++;
        	}
        	System.out.println();
        }
        
        System.out.println();
        
        
        //Number pyramid
        System.out.println("Enter Pyramid rows:");
        int r = sc.nextInt();
        int counter = 1;
        for(int i=1;i<=r;i++) {
        	for(int j=1;j<=r-i;j++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print(counter+" ");
        		counter++;
        	}
        	System.out.println();
        }
        sc.close(); 
      } 
}
