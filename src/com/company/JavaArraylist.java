package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int input = sc.nextInt();
                if (input == 0)break;
                list.add(j, input);
            }
        }
        int countOfOutputs = sc.nextInt();

        for (int i = 0; i < countOfOutputs; i++) {
            Integer ar = list.get(sc.nextInt());

        }
    }
}
