package com.example.java;

import java.util.Scanner;

public class LoopWithWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number, say n to find the sum of first n numbers: ");
        int n = scanner.nextInt(), sum = 0, count = 0;
        while (n != 0) {
            sum += n;
            n--;
            count++;
        }
        System.out.printf("The sum of first %d numbers is %d", count, sum);
    }
}
