package com.codegnan.assignments;

import java.util.Scanner;

public class DiscountOnline {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalCartValue = sc.nextDouble();
		boolean isFestivalSeason = sc.nextBoolean();
		boolean isMember = sc.nextBoolean();
		
		double discount = 0;
		double finalAmount;
		double festiveDiscount;
		double membershipDiscount;
		
		if(totalCartValue >= 10000) {
			discount = totalCartValue * 0.20;
		} else {
			if(totalCartValue >= 5000) {
				discount = totalCartValue * 0.10;
			} 
			else {
				discount = 0;
			}
		}
		
		if(isFestivalSeason) {
			festiveDiscount = totalCartValue * 0.05;
		} else {
			festiveDiscount = 0;
		}
		
		if(isMember) {
			membershipDiscount = 200;
		} else {
			membershipDiscount = 0; 
		}
		
		finalAmount = totalCartValue - discount - festiveDiscount - membershipDiscount;
		
		System.out.println("Initial Amount: " + totalCartValue);
		System.out.println("Discount(20%) " + discount);
		System.out.println("Festival Discount (5%): " + festiveDiscount);
		System.out.println("Premium Member Discount: " + membershipDiscount);
		System.out.println("Total Payable: " + finalAmount);
		
		sc.close();
	}

}
