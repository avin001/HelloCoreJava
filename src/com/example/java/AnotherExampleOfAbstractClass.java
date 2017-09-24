package com.example.java;

import sun.security.provider.SHA;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AnotherExampleOfAbstractClass {

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();

    }
}
