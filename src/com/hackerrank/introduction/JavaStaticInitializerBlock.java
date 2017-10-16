package com.hackerrank.introduction;
import java.util.Scanner;

public class JavaStaticInitializerBlock {
    
    static boolean flag = true;
    static int B, H;

    static {
        try {
            Scanner input = new Scanner(System.in);
            B = input.nextInt();
            H = input.nextInt();
            input.close();
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e) {
            System.out.println(e);
        }

    }
    
    public static void main(String[] args) {
        if (flag) {
            int area= B * H;
            System.out.print(area);
        }
        
    }

}