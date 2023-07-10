package com.company;

public class JavaGenerics <T>{
    public static void main(String[] args) {
        JavaGenerics javaGenerics = new JavaGenerics();
        Integer arr1[] = {1, 2, 3};
        String arr2[] = {"Hello", "World"};
        javaGenerics.<String>printArray(arr2);
        javaGenerics.<Integer>printArray(arr1);

    }
    public <T> void printArray(T[] arr){
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
