package com.example.java;

class Color {
    String color = "white";
}

public class UseSuperToReferParentClassVar extends Color {

    String color = "black";

    public void printColor() {
        System.out.println(color);
        System.out.println(super.color);    // super is used to refer immediate parent class instance variable.
    }

    public static void main(String[] args) {

        UseSuperToReferParentClassVar obj = new UseSuperToReferParentClassVar();
        obj.printColor();

    }
}
