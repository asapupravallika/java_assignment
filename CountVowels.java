package com.codegnan.assignment;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toLowerCase();
        String vowels = "aeiou";

        int vow_count = 0;
        int cons_count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vow_count++;
                } else {
                    cons_count++;
                }
            }
        }

        System.out.println("Vowels = " + vow_count);
        System.out.println("Consonants = " + cons_count);

        sc.close();
    }
}