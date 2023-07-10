package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        char [] sNew = s.toCharArray();
       // String s = "uhi o9u e,gy.ygu@jhgj";
        int size = 0;

        String str[] = s.split("[^a-zA-Z0-9]+");
        /*if(sNew[0] == ' ') size = str.length - 1;
        else size = str.length;*/
        System.out.println(str.length);
        for (String i : str){
            System.out.println(i);
        }
    }
}
