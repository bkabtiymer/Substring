package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int answer;
        boolean keepgoing = true;



        while (keepgoing == true) {

            System.out.println("Enter a word: ");
            word = scan.nextLine();
            System.out.println("Enter a num: ");
            answer = scan.nextInt();

            if (answer >= word.length()) {
                System.out.println("Index is larger than length ");
//                System.out.println("Enter a word: ");
//                word = scan.nextLine();
                System.out.println("Enter a num: ");
                answer = scan.nextInt();
                scan.nextLine();
                System.out.println("The section of word from index 0-5 is : " + word.substring(0, answer));
                break;

            } else {
                System.out.println(word.length());
                System.out.println("The section of word from index 0-5 is : " + word.substring(0, answer));

                break;

            }


        } // end of loop

    }
}
