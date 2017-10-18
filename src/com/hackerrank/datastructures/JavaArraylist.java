package com.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {
			int d = scan.nextInt();
			List<Integer> sublist= new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				sublist.add(scan.nextInt());
			}
			list.add(sublist);
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			try {
				System.out.println(list.get(x-1).get(y-1));
			} catch(Exception e) {
				System.out.println("ERROR!");
			}

		}
		scan.close();

	}

}
