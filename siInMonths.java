package com.codegnan.fundamentals;

import java.util.Scanner;

public class siInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount : ");
		double principal = sc.nextDouble();
		System.out.println("Enter Time (in months) : ");
		double time = sc.nextDouble();
		time /= 12;
		System.out.println("Enter Rate of Interest : ");
		double rate = sc.nextDouble();
		double si = (principal * time * rate) / 100;
		double amount = principal + si;
		System.out.println("Simple Interest : " + si);
		System.out.println("Total Amount : " + amount);
		sc.close();
	}

}
