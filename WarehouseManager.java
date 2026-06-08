package com.codegnan.fundamentals;

import java.util.Scanner;

public class WarehouseManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		double budget = sc.nextDouble();
		
		double totalCost = price * quantity;
		totalCost += totalCost * 0.1;
		
		boolean isOrderValid = totalCost <= budget && quantity >= 1;
		System.out.println(totalCost);
		System.out.println(isOrderValid);
		sc.close();
	}

}
