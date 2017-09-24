package com.example.java;

import java.util.Scanner;

public class TerminateProgramUsingReturn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer value: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("You did not provide a positive integer value.");
            return; // Terminate the program using return statement
        } else {
            System.out.println("Thanks for providing the value.");
        }
        if (n % 2 == 0) {
            System.out.println("You have provided an even number.");
        } else {
            System.out.println("You have provided an odd number.");
        }
    }
}
