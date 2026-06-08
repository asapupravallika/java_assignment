package com.codegnan.fundamentals;

import java.util.Scanner;

public class ProductUntilSingleNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while (number >= 10) {
			int product = 1;
			while (number > 0) {
				int digit = number % 10;
				product *= digit;
				number /= 10;
			}
			number = product;
		}
		System.out.println(number);

		scanner.close();
	}
}
