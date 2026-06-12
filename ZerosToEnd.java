package com.codegnan.assignment;
import java.util.Scanner;
public class ZerosToEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int index = 0;
		for(int i=0;i<size;i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		while(index < size) {
			arr[index++] = 0;
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
