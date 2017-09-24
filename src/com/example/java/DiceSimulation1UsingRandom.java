package com.example.java;

import java.util.Random;

public class DiceSimulation1UsingRandom {

    public static void main(String[] args) {

        /*
        Write a program to simulate rolling three dice and count how many times dice must
        be rolled until the values shown are all different.
         */

        int dice1, dice2, dice3, rollCount = 0;
        Random random = new Random();
        do {
            rollCount++;
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            dice3 = random.nextInt(6) + 1;
        } while ((dice1 == dice2) || (dice2 == dice3) || (dice1 == dice3));
        System.out.printf("Number of times 3 dice got rolled for achieving three different values is %d", rollCount);
    }
}
