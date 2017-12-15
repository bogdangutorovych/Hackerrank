package com.hackerrank.datastructures;

public class Java1DArrayPart2 {

	public static boolean canWin(int leap, int[] game) {
		return isSolvable(leap, game, 0);
	}

	private static boolean isSolvable(int m, int[] arr, int i) {
		if (i < 0 || arr[i] == 1) return false;
		if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

		arr[i] = 1;
		return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}

	public static void main(String[] args) {

		int[] game = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1};
		int leap = 5;
		System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	}
}