package com.codegnan.assignments;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int temp = number;
		int square = number * number;
		int digits = 0;
		
		while(temp>0) {
			digits++;
			temp /= 10;
		}
		
		int divisor = 1;
		for(int i=0;i<digits;i++) {
			divisor *= 10;
		}
		
		if(square%divisor == number) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not an Automorphic Number");
		}
		scanner.close();
	}

}
