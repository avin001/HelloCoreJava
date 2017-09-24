package com.example.java;

import java.util.Scanner;

public class SwitchConditionAsString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name of the month: ");
        String nameOfMonth = scanner.next();

        switch (nameOfMonth) {
            case "January":
                System.out.println("It's the first month of the year.");
                break;
            case "February":
                System.out.println("It's the second month of the year.");
                break;
            case "March":
                System.out.println("It's the third month of the year.");
                break;
            case "April":
                System.out.println("It's the fourth month of the year.");
                break;
            case "May":
                System.out.println("It's the fifth month of the year.");
                break;
            case "June":
                System.out.println("It's the sixth month of the year.");
                break;
            case "July":
                System.out.println("It's the seventh month of the year.");
                break;
            case "August":
                System.out.println("It's the eighth month of the year.");
                break;
            case "September":
                System.out.println("It's the ninth month of the year.");
                break;
            case "October":
                System.out.println("It's the tenth month of the year.");
                break;
            case "November":
                System.out.println("It's the eleventh month of the year.");
                break;
            case "December":
                System.out.println("It's the twelfth month of the year.");
                break;
            default:
                System.out.println("Have you entered a valid name of the month with first character in capital?");
        }
    }
}
