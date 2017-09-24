package com.example.java;

import java.util.Scanner;

public class TernaryOperatorCommonUsage {

    public static void main(String[] args) {

        // min value
        int minVal, a = 3, b = 2; // take user inputs
        minVal = a < b ? a : b;
        System.out.println("Minimum value: " + minVal);

        // absolute value
        int c = -10;
        int absValue = c < 0 ? -c : c;
        System.out.println("abs = " + absValue);

        // result is assigned the value 1.0
        float result = true ? 1.0f : 2.0f;
        System.out.println("float = " + result);

        // result is asigned the value "Sorry dude, it's false"
        String s = false ? "Dude, that was true." : "Sorry dude, it's false.";
        System.out.println(s);

        // Using the ternary operator on the rhs in a string
        int x = 5;
        String out = "There " + (x > 1 ? "are " + x + " cookies" : "is one cookie") + " in the jar.";
        System.out.println(out);

        // Using the ternary operator to find minimum and maximum of two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers with space in between or a return: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.printf("Minimum of the two numbers is %d%n", (n1 < n2 ? n1 : n2));
        System.out.printf("Maximum of the two numbers is %d%n", (n1 > n2 ? n1 : n2));
    }
}
