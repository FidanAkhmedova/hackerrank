package com.company;

import java.util.Scanner;

public class typeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";
        sentence = scanner.nextLine();
        int countStr = 0, countInt = 0, countDouble = 0;
        String []sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            System.out.println("fref " + sentences[i]);
            if (sentences[i].matches("[0-9]+")){
                countInt++;
                System.out.println("integer " + countInt);
            }
            else if (sentences[i].matches("[0-9.,]+")){
                countDouble++;
                System.out.println("double " + countDouble);
            }
            else{
                countStr++;                System.out.println("string " + countStr);

            }
            System.out.println("-------------------------");
            System.out.println("double\n " + countDouble);
            System.out.println("integer " + countInt);
            System.out.println("string " + countStr);
        }
    }
}
