package com.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			try {
				String query = scan.next();
				if (query.equals("Insert")) {
					list.add(scan.nextInt(), scan.nextInt());
				} else if (query.equals("Delete")) {
					list.remove(scan.nextInt());
				}
				
			} catch (Exception e) {
				System.out.print("Bad query!");
			} 
		}
		
		for (Integer integer : list) {
			System.out.print(integer  + " ");
		}
		scan.close();
	}

}
