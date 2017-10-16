package com.hackerrank.string;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if(s.length() == 0){
            System.out.println("0");
        } else {
            String[] parts = s.trim().split("[^A-Za-z]+");
            System.out.println(parts.length);
            for (String string : parts) {
                System.out.println(string);
            }
        }
    }

}
