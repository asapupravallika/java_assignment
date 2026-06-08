package com.codegnan.assignments;

import java.util.Scanner;

public class MilkWaterRatio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double initialmilkratio = sc.nextDouble();
		double initialwaterratio = sc.nextDouble();
		double mixture = sc.nextDouble();
		double finalmilkratio = sc.nextDouble();
		double finalwaterratio = sc.nextInt();
		double initialmilkfraction = (double) initialmilkratio / (initialwaterratio * initialmilkratio);
		double finalmilkfraction = (double) finalmilkratio / (finalwaterratio * finalmilkratio);
		double capacity = mixture / (1 - (finalmilkfraction / initialmilkfraction));
		System.out.println("Container capacity : " + (int) capacity + " litres");
		sc.close();
	}

}