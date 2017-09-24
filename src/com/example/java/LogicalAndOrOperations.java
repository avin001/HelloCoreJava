package com.example.java;

import java.util.Scanner;

public class LogicalAndOrOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your marks: ");
        int marks = scanner.nextInt();

        if ((marks >= 80) && (marks <= 100)) {
            System.out.println("Well done. Keep it up!");
        }
        else if ((marks >= 60) && (marks < 80)) {
            System.out.println("Work harder to improve.");
        }
        else {
            System.out.println("You're grounded as you haven't being paying attention.\n");
        }

        boolean rainyDay, sunnyDay;
        System.out.println("You're in Manchester, where it's always raining. Even if it's not, you always have to " +
                           "carry an umbrella.");
        System.out.println("Please enter \"true\" if it is a rainy day today, otherwise enter \"false\": ");
        rainyDay = scanner.nextBoolean();

        if (rainyDay) {
            System.out.println("It is a rainy day in Manchester.");
            sunnyDay = false;
        } else {
            System.out.println("It is sunny right now in Manchester.");
            sunnyDay = true;
        }

        if (rainyDay || sunnyDay) {
            System.out.println("I always carry an umbrella.");
        }

    }
}
