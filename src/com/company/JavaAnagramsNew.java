package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagramsNew {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toUpperCase();
        b = b.toUpperCase();

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);


        return Arrays.equals(arrA, arrB);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        isAnagram(a, b);
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
