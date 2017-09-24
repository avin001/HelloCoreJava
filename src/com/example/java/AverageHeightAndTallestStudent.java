package com.example.java;

import java.util.Scanner;

public class AverageHeightAndTallestStudent {

    public static void main(String[] args) {

        /*
        Write a program to find the average height of the class of students and maximum height in the class. The total
        number of students in the class is input from the user. Also, height of each student is inputted by the user.
         */

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents;
        System.out.print("Please enter how many students are there in the class: ");
        numberOfStudents = scanner.nextInt();
        double[] studentHeights = new double[numberOfStudents];
        System.out.printf("There are %d students in the class as per the user input. Please " +
                          "provide the heights of each of the students individually.%n", numberOfStudents);
        int i = 0;
        double sumOfHeights = 0;
        double maxHeight = studentHeights[0];
        do {
            System.out.printf("Please enter the height of Student%d: ", (i + 1));
            for (double height:studentHeights
                 ) {
                height = scanner.nextDouble();
                sumOfHeights += height;
                if (maxHeight < height) {
                    maxHeight = height;
                }
                break;
            }
            i++;
        } while (i < numberOfStudents);

        double average = sumOfHeights/numberOfStudents;
        System.out.printf("Average height of the students of the class is %f%n", average);
        System.out.println("Average height of the students of the class is " + average);
        System.out.printf("Maximum height in the class is %f%n", maxHeight);

    }
}

