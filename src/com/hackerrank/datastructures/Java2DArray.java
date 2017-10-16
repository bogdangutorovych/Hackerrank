package com.hackerrank.datastructures;

import java.util.Scanner;

public class Java2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        in.close();
        
        int hourGlassesSum = calcHourGlassesSum(arr, 0, 0);
        for (int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                hourGlassesSum = Math.max(hourGlassesSum, calcHourGlassesSum(arr, i, j)); 
            }
        }
        System.out.println(hourGlassesSum);
    }
    
    public static int calcHourGlassesSum (int[][] array, int x, int y) {
        int sum = 0;
        sum = array[x][y] + array[x][y+1] + array[x][y+2] + array[x+1][y+1] + array[x+2][y] + array[x+2][y+1] + array[x+2][y+2];
        return sum;
    }       
}
