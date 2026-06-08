package com.codegnan.fundamentals;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		String result = (marks > 35) ? "Pass" : "Fail";
		System.out.println(result);
		sc.close();
	}

}
