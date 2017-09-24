package com.example.java;

public class Example1JavaRecursion {

    public static int count = 0;

    public static void print() {
        count++;
        if (count <= 5) {
            System.out.printf("Hello %d%n", count);
            print();
        }
    }

    public static void main(String[] args) {

        print();
    }
}
