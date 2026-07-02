package com.codegnan.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			if(i != list.size() - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		ArrayList<Integer> unique = new ArrayList<>();
		for(int num:list) {
			if(!unique.contains(num)) {
				unique.add(num);
			}
		}
		for (int i = 0; i < unique.size(); i++) {
            System.out.print(unique.get(i));
            if (i != unique.size() - 1) {
                System.out.print(" ");
            }
        }
		sc.close();
	}
}
