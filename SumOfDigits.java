package com.codegnan.fundamentals;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int original = number;
		int sum = 0;
		while(number!=0) {
			int digit = number%10;
			sum += digit;
			number /= 10;
		}
		System.out.println("Sum of Digits in " + original + " are " + sum);
		scanner.close();
	}

}
