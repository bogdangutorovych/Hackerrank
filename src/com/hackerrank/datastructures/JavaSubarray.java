package com.hackerrank.datastructures;

import java.util.Scanner;


public class JavaSubarray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];

		int count = 0;

		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int summ = 0;
				for (int k = i; k <= j; k++) {
					summ += array[k]; 
				}
				if (summ < 0) {
					count++;
				}
			}

		}
		scan.close();
		System.out.println(count);
	}

}
