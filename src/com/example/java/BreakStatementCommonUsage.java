package com.example.java;

import java.util.Scanner;

public class BreakStatementCommonUsage {

    public static void main(String[] args) {

        /*
        Print the name of first student whose name starts with A from an array containing student names provided by user
         */
        Scanner scanner = new Scanner(System.in);

        boolean nameFound = false;
        String[] studentNames = new String[5];
        int i = 0;
        do {
            System.out.printf("Please provide name of the student %d: ", (i + 1));
            studentNames[i] = scanner.nextLine();
            i++;
        } while (i < studentNames.length);

        for (String name:studentNames
             ) {
            if (name.charAt(0) == 'A') {
                System.out.printf("The name of the first student in the array whose name starts with A is %s%n", name);
                nameFound = true;
                break;
            }
        }
        if (!nameFound) {
            System.out.println("The user did not provide any student name starting with A.");
        }
        System.out.println("Run the program again by instantiating a new array.");
    }
}
