package com.hackerrank.string;

import java.util.Arrays;

public class JavaAnagrams {

    public static void main(String[] args) {

        System.out.println(isAnagram("Hello", "hello"));
    }

    static boolean isAnagram(String a, String b) {
        
        return sortCharsInString(a).equals(sortCharsInString(b)) ? true : false;
    }

    static String sortCharsInString(String string) {
        char[] stringChars = string.toLowerCase().toCharArray();
        Arrays.parallelSort(stringChars);
        return Arrays.toString(stringChars);
        
    }

}