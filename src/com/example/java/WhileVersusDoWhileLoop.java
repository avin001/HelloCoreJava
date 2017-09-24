package com.example.java;

public class WhileVersusDoWhileLoop {

    public static void main(String[] args) {

        int count = 1;
        while (count < 0) {
            System.out.println(count);
            count++;
        }
        System.out.println("----------------------------");

        int x = 1;
        do {
            System.out.println(x);
        } while (x < 0);
    }
}
