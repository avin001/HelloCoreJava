package com.example.java;

import java.util.Scanner;

public class MethodAverageOfNumbers {

    public static void main(String[] args) {

        /*
        Program to compute the average of numbers where both the count of numbers and numbers
        is inputted by the user.
         */

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the count of numbers (how many numbers)" +
                         " for which you want to calcuate the average: ");
        n = scanner.nextInt();
        System.out.printf("Please enter the value of %d numbers for which you want to calculate the average: ", n);

        double[] number = new double[n];
        int i = 0;
        do {
            number[i] = scanner.nextDouble();
            i++;
        } while (i < n);
        double avg = findAverage(n, number);
        System.out.printf("The average of numbers provided is %.2f", avg);

    }

    public static double findAverage(int countOfNumbersToBeAveraged, double[] number) {
        double sumOfNumbers = 0;
        for (double n:number
             ) {
            sumOfNumbers += n;
        }
        double avg = sumOfNumbers/countOfNumbersToBeAveraged;
        return avg;
    }
}
