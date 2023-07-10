package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    String str = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    public String pattern = str + "." + str + "." + str + "." + str;
//    public static String pattern = "^[[[0-9]{1,3}][.]]{3}";
    //public static PatternSyntaxChecker patternSyntaxChecker = new PatternSyntaxChecker(pattern);

}
