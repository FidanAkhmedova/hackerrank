package com.company;

public class Sertification {
    public static void main(String[] args) {
        try {
            Float f1 = 3.0f;
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        }
        catch (NumberFormatException e){
            System.out.println("bad number");
        }

    }
}
