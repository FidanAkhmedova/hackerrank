package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = scanner.nextInt();
        int arr[] = new int[countOfNumbers];
        int count = 0;

        //define array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = 1;
        while (k <= arr.length){
            count += countOfNegatives(arr, k);
            System.out.println("-----------------------" + count);
            k++;
        }


    }
    public static int countOfNegatives(int []arr, int k){

        int sum;int count = 0, counter;

        for (int i = 0; i < arr.length; i++) {
            sum = 0; counter = k;

            for (int j = i; counter>0 && j <= arr.length-counter; j++) {
                sum +=arr[j];
                System.out.println(sum + "sum");
                k--;
            }
            if (sum < 0){
                count++;
                System.out.println(" count " + count + " i " + i + " sum " + sum);
            }
        }
        return count;
    }
}
