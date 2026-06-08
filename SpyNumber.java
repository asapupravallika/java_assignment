package com.codegnan.fundamentals;
import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum=0;
		int product=1;
		while(number > 0) {
			int digit = number % 10;
			sum += digit;
			product *= digit;
			number /= 10;
		}
		if(sum == product) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not a Spy Number");
		}
		scanner.close();
	}

}
