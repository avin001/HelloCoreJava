package com.example.java;

interface Drawable {

    void draw();
}

class ShapeRectangle implements Drawable {

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class ShapeCircle implements Drawable {

    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Example2JavaInterface {

    public static void main(String[] args) {

        Drawable obj1 = new ShapeRectangle();
        obj1.draw();
        Drawable obj2 = new ShapeCircle();
        obj2.draw();
    }
}
