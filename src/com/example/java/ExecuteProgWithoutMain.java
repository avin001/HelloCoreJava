package com.example.java;

public class ExecuteProgWithoutMain {

    /*
    Execute using command line
    *******************************
    Output if not JDK 1.7:
    Static block is invoked.
    *******************************
    In JDK7 and above, output will be:
    Output:Error: Main method not found in class A3, please define the main method as:
    public static void main(String[] args)
     */

    static {
        System.out.println("Static block is invoked.");
        System.exit(0);
    }
}
