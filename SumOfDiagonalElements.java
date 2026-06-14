package com.codegnan.assignment;

import java.util.Scanner;

public class SumOfDiagonalElements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
		    sum += arr[i][i];           // primary diagonal
		    sum += arr[i][n - 1 - i];   // secondary diagonal
		}
		if(n % 2 == 1) {
		    sum -= arr[n / 2][n / 2];   // avoid counting center twice
		}
		System.out.println(sum);
		sc.close();
	}
}
