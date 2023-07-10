package com.company;

public class JavaIntToString {
    public static void main(String[] args) {
        System.out.println( getSmallestAndLargest("welcometojava", 3));


    }
    public static String getSmallestAndLargest(String s, int k){

        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for (int i = 0; i < s.length() - k + 1; i++) {

            if (s.substring(i,i+k).compareTo(largest) > 0){
                largest = s.substring(i, i+k);
            }
           // if (s.substring(i,i+3).compareTo(smallest) < 0){
            else{
                smallest = s.substring(i, i+k);
            }
        }

        return smallest + "\n" + largest;
    }











}
