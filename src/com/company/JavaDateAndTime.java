package com.company;

import java.text.*;
import java.util.*;

class Result {

    public static String findDay( int month, int day, int year) {

        String input = day + "/" + month + "/" + year;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String sMyDate = "";
        Date myDate = null;
        
        try {
            myDate = sdf.parse(input);
            sdf.applyPattern("EEEEEE");
            sMyDate = sdf.format(myDate);

        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return sMyDate.toUpperCase();
    }

}

public class JavaDateAndTime {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int year = scanner.nextInt();
            System.out.println(Result.findDay(month, day, year));

    }
}
