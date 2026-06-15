package com.codegnan.assignment;
import java.util.Scanner;
public class GreaterThanAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		int sum = 0;
		int count = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
				count++;
				sum += arr[i][j];
			}
		}
		double average = (double)sum / count;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j] > average) {
					System.out.println(arr[i][j]);
				}
			}
		}
		sc.close();
	}
}