package com.company;
import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        String[] arr2 = {"Hello", "World"};

        bufferedReader.close();
        BigInteger bigInteger = new BigInteger(n);
        if (bigInteger.isProbablePrime(1)) System.out.println("prime");
        else System.out.println("not prime");
    }
}
