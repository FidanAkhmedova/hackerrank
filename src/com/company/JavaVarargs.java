package com.company;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class JavaVarargs {

    public void add(int... n) {
        int sum = 0, i = 0;
        StringBuilder str = new StringBuilder();
        for (int e : n) {
            if (i == 0) str = new StringBuilder(Integer.toString(e));
            else {str.append("+").append(Integer.toString(e));}
            sum += e;
            i++;
        }
        System.out.println(str + "=" + sum);
    }
}
     class Solution {

        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n1 = Integer.parseInt(br.readLine());
                int n2 = Integer.parseInt(br.readLine());
                int n3 = Integer.parseInt(br.readLine());
                int n4 = Integer.parseInt(br.readLine());
                int n5 = Integer.parseInt(br.readLine());
                int n6 = Integer.parseInt(br.readLine());
                JavaVarargs ob = new JavaVarargs();
                ob.add(n1, n2);
                ob.add(n1, n2, n3);
                ob.add(n1, n2, n3, n4, n5);
                ob.add(n1, n2, n3, n4, n5, n6);
                Method[] methods = JavaVarargs.class.getDeclaredMethods();
                Set<String> set = new HashSet<>();
                boolean overload = false;
                for (int i = 0; i < methods.length; i++) {
                    if (set.contains(methods[i].getName())) {
                        overload = true;
                        break;
                    }
                    set.add(methods[i].getName());

                }
                if (overload) {
                    throw new Exception("Overloading not allowed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}


