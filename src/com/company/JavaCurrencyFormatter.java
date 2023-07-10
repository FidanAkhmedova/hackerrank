package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = "";
        String france = "";
        String india  = "";
        String china = "";
        NumberFormat numberFormatUs = NumberFormat.getCurrencyInstance(Locale.US);
        us = numberFormatUs.format(payment);

        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = numberFormatChina.format(payment);

        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = numberFormatFrance.format(payment);

        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        india = numberFormatIndia.format(payment);
        System.out.println(us);
        System.out.println(china);
        System.out.println(france);
        System.out.println(india);

    }
}
