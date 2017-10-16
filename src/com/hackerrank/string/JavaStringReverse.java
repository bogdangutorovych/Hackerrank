package com.hackerrank.string;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        String reverse = new StringBuilder(A).reverse().toString();
        System.out.print(reverse.equals(A) ? "Yes" : "No");
        
    }
    
}
