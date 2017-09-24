package com.example.java;

import java.util.Scanner;

public class PrePostIncrementDecrement {

    public static void main(String[] args) {

        int x = 1;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println("---------");

        int y = 1;
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);
        System.out.println("---------");

        int a = 1;
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println("---------");

        int b = 1;
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b);
        System.out.println("---------");

        int num1, num2, num3;
        num1 = 100;
        num2 = ++num1;
        num3 = num2++ + ++num1;
        System.out.println(num1); // Final value should be 102
        System.out.println(num2); // Final value should be 102
        System.out.println(num3); // Final value should be 203

    }
}
