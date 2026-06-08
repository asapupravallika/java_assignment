package com.codegnan.assignments;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int original = number;
		int sum = 0;
		int count = 0;
		while(number != 0) {
			number /= 10;
			count++;
		}
		number = original;
		while(number != 0) {
			int digit = number%10;
			sum += Math.pow(digit, count);
			number /= 10;
		}
		if(original == sum) {
			System.out.println(original + " is an Armstrong Number");
		} else {
			System.out.println(original + " is not an Armstrong Number");
		}
		
		scanner.close();

	}
}
