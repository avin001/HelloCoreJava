package com.example.java;

import java.util.Scanner;

public class InputFromUserThruConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.print("Please enter your first value: ");
        x = scanner.nextInt();
        System.out.print("Please enter your second value: ");
        y = scanner.nextInt();
        System.out.print("Please enter the operator for the entered values: ");
        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.print("The addition result is: " + (x + y));
        }
        else if (operator.equals("-")) {
            System.out.print("The subtraction result is: " + (x - y));
        }
        else if (operator.equals("*")) {
            System.out.print("The multiplication result is: " + (x * y));
        }
        else if (operator.equals("/")) {
            System.out.print("The division result is " + ( x / y));
        }
        else {
            System.out.print("Please enter the correct operator for the entered values: ");
        }
    }
}
