package com.example.java;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        /*
        Print the following shapes respectively using loop(s). Scale the program for any user input.

        1*****      12345&      @
        12****      1234&&      @ @
        123***      123&&&      @   @
        1234**      12&&&&      @     @
        12345*      1&&&&&      @       @
        123456      &&&&&&      @ @ @ @ @ @

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to build the pattern: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
                j++;
            }
            i++;
            System.out.println();
        }

        System.out.println("=========================================");
        System.out.print("Please enter a number to build the next pattern: ");
        n = scanner.nextInt();

        i = 1;
        while (i <= n) {
            int j = 1, count = n;
            while (j <= n - i) {
                System.out.print(j);
                count--;
                j++;
            }
            while (count > 0) {
                System.out.print("&");
                count--;
            }
            i++;
            System.out.println();
        }

        System.out.println("=========================================");
        System.out.print("Please enter a number to build the next pattern: ");
        n = scanner.nextInt();

        i = 1;
        while (i < n) {
            int j = 1;
            while (j <= i) {
                if (j == 1 || j == i) {
                    System.out.print("@");
                } else if (j > 1 && j < n) {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        while (i > 0) {
            System.out.print("@");
            i--;
        }

    }
}
