package com.hackerrank.datastructures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayPart2CompareResults {

	public static void main(String[] args) {

		String fileWithTestCases = "d://temp/tests.txt";
		String fileWithResults = "d://temp/results.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;

		try {
			Scanner scanner = new Scanner(new File(fileWithTestCases));
			Scanner scanner2 = new Scanner(new File(fileWithResults));

			File fileOutput = new File("d://temp/comparisson.txt");

			if (!fileOutput.exists()) {
				fileOutput.createNewFile();
			}

			fw = new FileWriter(fileOutput.getAbsoluteFile());
			bw = new BufferedWriter(fw);

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
				String calculatedResult = (Java1DArrayPart2.canWin(leap, game)) ? "YES" : "NO";

				if (!calculatedResult.equals(resultFromFile)) {
					
					bw.write(Integer.toString(i + 1));
					bw.newLine();
					bw.write("Dimension: " + game.length);
					bw.newLine();
					bw.write("Leap: " + leap);
					bw.newLine();
					bw.write(Arrays.toString(game));
					bw.newLine();
					bw.write("Calculated vs From file");
					bw.newLine();
					bw.write(calculatedResult + " vs " + resultFromFile);
					bw.newLine();
					bw.newLine();

					errorCount++;
				}
			}
			bw.write("Total error count: " + Integer.toString(errorCount));
			scanner.close();
			scanner2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
	}
	        
}

