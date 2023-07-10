package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public PatternSyntaxChecker(String pattern) {
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        boolean check = false;
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            check = false;
            String pattern = in.nextLine();
            try {
                Pattern p = Pattern.compile(pattern);
            }
            catch (Exception e){
                check = true;
            }
            finally {
                if (check)  System.out.println("Invalid");
                else    System.out.println("Valid");
            }
            testCases--;

        }
    }
}
