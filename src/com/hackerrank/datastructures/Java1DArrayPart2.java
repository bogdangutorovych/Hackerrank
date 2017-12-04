package com.hackerrank.datastructures;




public class Java1DArrayPart2 {

	public static boolean canWin(int leap, int[] game) {

		boolean hasTurn = true;
		int index = 0;
		while (hasTurn) {
			if (index+leap >= game.length - 1) {
				return true;
			} else if (game[index+leap] == 0) {
				index += leap;
				continue;
			} else if (game[index+1] == 0) {
				index++;
				continue;
			}

			hasTurn = false;
			for (int i = 1; i < Math.min(index, leap - 2) ; i++) {
				if (game[index-i] != 0) {
					break;
				} else if (game[index-i] == 0 && game[index-i+leap] == 0) {
					index = index-i+leap;
					hasTurn = true;
					break;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] game = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1};
		int leap = 5;
		System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	}
}

