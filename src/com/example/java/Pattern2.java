package com.example.java;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        /*
        Write a program to generate the following output (in the given layout) using loop(s). Scale the program to add
        any number of columns.

        1  10  11  20  21  30
        2  9   12  19  22  29
        3  8   13  18  23  28
        4  7   14  17  24  27
        5  6   15  16  25  26
        6  5   16  15  26  25
        7  4   17  14  27  24
        8  3   18  13  28  23
        9  2   19  12  29  22
        10 1   20  11  30  21

         */

        //  Assigning number to rows
        int numOfRows = 10;
        Scanner scanner = new Scanner(System.in);
        //  Assigning number of columns
        System.out.print("Please enter a number of columns to build the pattern: ");
        int numOfCols = scanner.nextInt();

        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= numOfCols; j++) {
                
            }
        }


    }
}
