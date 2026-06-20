package com.codegnan.assignment;

import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			int count = 0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (ch == s.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(ch + " = " + count);
            }
		}
		sc.close();
	}

}
