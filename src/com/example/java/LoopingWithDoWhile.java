package com.example.java;

import java.util.Scanner;

public class LoopingWithDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String guess;
        int count = 0;
        do {
            System.out.print("Guess my name: ");
            guess = scanner.next();
            count++;
        } while (!("Avin".equals(guess)));
        System.out.printf("Congratulations, you guessed my name correctly in %d tries.!", count);
    }
}
