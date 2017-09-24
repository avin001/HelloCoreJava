package com.example.java;

import java.util.Scanner;

public class DoWhileLoopCommonUsage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        Take an integer input from the user until the user enters a positive number.
         */
        int number;
        do {
            System.out.print("Please enter a positive number: ");
            number = scanner.nextInt();
        } while (number < 0);
        System.out.printf("Number entered by user is %d", number);
    }
}
