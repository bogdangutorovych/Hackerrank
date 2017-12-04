package com.hackerrank.datastructures;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayPart2CompareResults {

	public static boolean canWin(int leap, int[] game) {

		boolean hasTurn = true;
		int index = 0;
		while (hasTurn) {
			if (index+leap >= game.length) {
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

		String fileWithTestCases = "d://temp/tests.txt";
		String fileWithResults = "d://temp/results.txt";
		try {
			Scanner scanner = new Scanner(new File(fileWithTestCases));
			Scanner scanner2 = new Scanner(new File(fileWithResults));
			int n = scanner.nextInt();
			int errorCount = 0;
			for (int i = 0; i < n; i++) {
				int dimension = scanner.nextInt();
				int leap = scanner.nextInt();
				String resultFromFile = scanner2.nextLine();
				int[] game = new int[dimension];
				for (int j = 0; j < dimension; j++) {
					game[j] = scanner.nextInt();
				}
				String calculatedResult = (canWin(leap, game)) ? "YES" : "NO";
				
				if (!calculatedResult.equals(resultFromFile)) {
					
					int line = i + 1; 
					System.out.println(line);
					System.out.println("Dimension: " + game.length);
					System.out.println("Leap: " + leap);
					System.out.println(Arrays.toString(game));
					System.out.println("Calculated vs From file");
					System.out.println(calculatedResult + " vs " + resultFromFile);
					System.out.println();
					errorCount++;
				}
			}
			System.out.println(errorCount);
			scanner.close();
			scanner2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	        
}

