package com.company;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverseString(str));
    }

    public static boolean reverseString(String str){
        String reversedString = "";
        char[] arrOfLetters = str.toCharArray();
        char w;
        int newLength = (arrOfLetters.length)/2;

        for (int i = 0; i < newLength; i++) {
            w = arrOfLetters[i]; arrOfLetters[i] = arrOfLetters[arrOfLetters.length - i - 1]; arrOfLetters[arrOfLetters.length - i - 1] = w;
        }

        for (char arrOfLetter : arrOfLetters) {
            reversedString += arrOfLetter;
        }
        return str.equals(reversedString);
    }

}
