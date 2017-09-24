package com.example.java;

import java.util.Scanner;

public class Example2JavaRecursionFactorialOfNumber {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number for which you want to calculate factorial: ");
        int n = scanner.nextInt();
        System.out.printf("The factorial of %d is %d%n", n, factorial(n));
    }
}
