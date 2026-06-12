package com.codegnan.assignment;
import java.util.Scanner;
public class LibraryFineCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] arr = new int[N];	
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = new int[Q];
		for(int i=0;i<Q;i++) {
			int L = sc.nextInt();
            int R = sc.nextInt();
            int T = sc.nextInt();
            int sum = 0;
            for (int j = L - 1; j < R; j++) {
                sum += arr[j];
            }
            result[i] = Math.min(sum, T);
		}
		for (int i = 0; i < Q; i++) {
            System.out.println(result[i]);
        }
		sc.close();
	}
}
