package com.codegnan.assignments;

import java.util.Scanner;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String divisibility = (num%3 == 0 && num%5 == 0) ? "Divisible by 3 and 5" : "Not Divisible by 3 and 5";
		System.out.println(divisibility);
		sc.close();
	}

}
