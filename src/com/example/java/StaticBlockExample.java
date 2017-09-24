package com.example.java;

public class StaticBlockExample {

    /*
    Java static block
    1) Is used to initialize the static data member.
    2) It is executed before main method at the time of classloading.
     */

    static {
        System.out.println("Static block is invoked.");
    }

    public static void main(String[] args) {

        System.out.println("Hello main.");
    }
}
