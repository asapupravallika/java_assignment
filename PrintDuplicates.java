package com.codegnan.oopprograms;

import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
		    int count = 0;

		    for (int j = 0; j < i; j++) {
		        if (s.charAt(i) == s.charAt(j)) {
		            count++;
		        }
		    }

		    if (count == 1) {
		        System.out.print(s.charAt(i) + " ");
		    }
		}
		sc.close();
	}

}
