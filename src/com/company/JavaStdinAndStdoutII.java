package com.company;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static int i;
    public static double d;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i ;
        double d;
        String s;

        i = scan.nextInt();
        d = scan.nextDouble();
        scan.nextLine();

        System.out.println("String: " + scan.nextLine());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
