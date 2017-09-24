package com.example.java;

import java.util.Scanner;

public class FibonacciSeriesWithoutUsingRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the nth number upto which the fibonacci series should be printed: ");
        int count = scanner.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 0; i < count; i++) {
            if (n1 == 0 && n2 == 1) {
                System.out.print(n1 + " " + n2);
            }
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
