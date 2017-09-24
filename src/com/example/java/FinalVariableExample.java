package com.example.java;

public class FinalVariableExample {

    final int speedLimit = 90;

    public void run() {

         // speedLimit = 120;
        // Compile Time Error: Cannot assign a value to final variable 'speedLimit'
        System.out.printf("Running with a speed of less than equal to %d", speedLimit);
    }

    public static void main(String[] args) {

        FinalVariableExample f = new FinalVariableExample();
        f.run();
    }
}
