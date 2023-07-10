package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTry_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        int division;
        try {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            division = num1 / num2;
            System.out.println(division);
        }
        catch (InputMismatchException ime){
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException a){
            System.out.println(a);
        }
    }
}