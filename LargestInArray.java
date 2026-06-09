package com.codegnan.assignments;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < N; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest element: " + smallest);
		System.out.println("Largest element: " + largest);
		sc.close();
	}
}