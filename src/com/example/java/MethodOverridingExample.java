package com.example.java;

class Vehicle {

    public void run() {
        System.out.println("Vehicle is running.");
    }
}

class Car extends Vehicle {

    public void run() {
        System.out.println("Car is ruuning.");
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {

        Car c = new Car();
        c.run();
    }
}
