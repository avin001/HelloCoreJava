package com.example.java;

import java.util.Scanner;

public class MethodOverloadingAverageExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates the average of 3 numbers (integers or decimals) in decimals.");
        String numberSystem = "";
        System.out.print("Choose the \"Integer\" or \"Decimal\" number system to calculate the average: ");
        numberSystem = scanner.nextLine();
        if (numberSystem.equals("Integer")) {
            System.out.print("Please provide 3 integer values for calculating average: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.printf("Average of three integers provided by user is %4.2f ", average(x, y, z));
        }
        else if (numberSystem.equals("Decimal")) {
            System.out.print("Please provide 3 decimal values for calculating average: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            System.out.printf("Average of three decimal numbers provided by user is %5.4f ", average(x, y, z));
        }
    }

    public static double average(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
