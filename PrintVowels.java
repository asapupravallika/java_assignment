package com.codegnan.assignment;

import java.util.Scanner;

public class PrintVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String vowels = "aeiou";
		for(int i = 0; i < word.length(); i++) {
		    if(vowels.indexOf(word.charAt(i)) != -1) {
		        System.out.print(word.charAt(i));
		    }
		}
		sc.close();
	}

}
