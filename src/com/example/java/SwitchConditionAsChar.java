package com.example.java;

import java.util.Scanner;

public class SwitchConditionAsChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the weekday number from 1 to 7 where 1 corresponds to Monday and so on: ");

        /*
        Scanner class in Java supports nextInt(), nextLong(), nextDouble() etc. But there is no nextChar()
        To read a char, we use next().charAt(0). next() function returns the next token/word in the input
        as a string and charAt(0) function returns the first character in that string.
         */

        char weekdayNumber = scanner.next().charAt(0);
        String weekdayName = "";

        switch (weekdayNumber) {
            case '1':
                weekdayName = "Monday";
                break;
            case '2':
                weekdayName = "Tuesday";
                break;
            case '3':
                weekdayName = "Wednesday";
                break;
            case '4':
                weekdayName = "Thursday";
                break;
            case '5':
                weekdayName = "Friday";
                break;
            case '6':
                weekdayName = "Saturday";
                break;
            case '7':
                weekdayName = "Sunday";
                break;
            default:
                System.out.println("You have not entered a correct weekday number within the range" +
                        " from 1 to 7 both inclusive");
                return; // terminates the program

        }
        System.out.printf("You have entered weekday number as %c which corresponds to %s.", weekdayNumber, weekdayName);
    }
}
