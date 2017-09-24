package com.example.java;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y;
        System.out.print("Please enter a value for x: ");
        x = scanner.nextInt();
        System.out.println("Please enter a value for y: ");
        y = scanner.nextInt();

        if (x > y) {
            System.out.println("x is greater than y.");
        }
        else if (x == y) {
            System.out.println("x is equal to y.");
        }
        else {
            System.out.println("x is less than y.");
        }
    }
}
