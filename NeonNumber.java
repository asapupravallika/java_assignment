package com.codegnan.fundamentals;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int square = number * number;
		int sum = 0;
		while(square>0) {
			int digit = square%10;
			sum += digit;
			square /= 10;
		}
		if(sum == number) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon Number");
		}
		scanner.close();
	}

}
