package com.example.java;

abstract class Motorbike {
    float speed = 250.0f;

    public Motorbike() {
        System.out.println("Let's get the bike started.");
    }

    abstract void run();

    public void changeGear() {
        System.out.println("Change gear to match different speeds.");
    }
}

class Honda extends Motorbike {

    public void run() {
        System.out.printf("I'm riding a Honda motorbike with a top speed of %3.2f%n", speed);
    }
}

public class AbstractClassWithDataConstructorMethods {

    public static void main(String[] args) {

        Motorbike bike = new Honda();
        bike.run();
        bike.changeGear();
    }
}
