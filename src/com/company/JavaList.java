package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        while (k > 0){
            String str = ""; str = sc.next();
             if (str.equals("Insert")){
                 int key, value;
                 key = sc.nextInt();
                 value = sc.nextInt();
                 list.add(key, value);
             }
             else if (str .equals("Delete")){
                 int key1;
                 key1 = sc.nextInt();
                 list.remove(key1);
             }
            k--;
        }
        for (Integer l:list) {
            System.out.print(l + " ");
        }
    }
}
