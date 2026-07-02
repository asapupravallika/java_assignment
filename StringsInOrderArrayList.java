package com.codegnan.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringsInOrderArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			
			if(!str.matches("[a-zA-Z]+")) {
				break;
			}
			
			list.add(str);
		}
		Collections.sort(list);
		
		for(String s : list) {
			System.out.println(s+" ");
		}
		sc.close();
	}

}
