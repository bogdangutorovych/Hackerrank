package com.hackerrank.introduction;

import java.util.Scanner;

public class JavaLoopsII {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            String stringResult = "";
            for (int j=0; j<n ; j++) {
                result += Math.pow(2,j) * b;
                stringResult += result + " "; 
            }
            System.out.println(stringResult);
        }
        in.close();
    }
    
}
