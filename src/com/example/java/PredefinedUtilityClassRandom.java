package com.example.java;

import java.util.Random;

public class PredefinedUtilityClassRandom {

    public static void main(String[] args) {

        /*
        Write a program to simulate rolling two dice one hundred times and count how many times
        we rolled doubles.
         */

        int dice1, dice2, countDouble = 0;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            if (dice1 == dice2) {
                countDouble++;
            }
        }
        System.out.printf("User rolled doubles %d times.", countDouble);
    }
}
