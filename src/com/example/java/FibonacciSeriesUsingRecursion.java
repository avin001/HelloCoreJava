package com.example.java;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

    public static int count;
    public static int n1 = 0, n2 = 1, n3;

    public static void printNextFibonacci(int count) {
        if (count > 0) {
            if (n1 == 0 && n2 == 1) {
                System.out.print(n1 + " " + n2);
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printNextFibonacci(count - 1);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the nth number upto which the fibonacci series should be printed: ");
        count = scanner.nextInt();
        printNextFibonacci(count);
    }

}
