package com.codegnan.fundamentals;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int original = number;
		int sum = 0;
		while(number>0) {
			int product = 1;
			int digit = number%10;
			for(int i=1;i<=digit;i++) {
				product *= i;
			}
			sum += product;
			number /= 10;
		}
		if(original == sum) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a Strong Number");
		}
		scanner.close();
	}

}
