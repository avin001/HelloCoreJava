package com.example.java;

public class ContinueStatementCommonUsage {

    public static void main(String[] args) {

        /*
        Print odd numbers less than 10.
         */

        for (int i = 0; i < 10; i++) {
            if (i % 2 ==0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("***************");

        /*
        Print even numbers less than 10.
         */

        for (int j = 1; j < 10; j++) {
            if (!(j % 2 == 0)) {
                continue;
            }
            System.out.println(j);
        }

    }
}
