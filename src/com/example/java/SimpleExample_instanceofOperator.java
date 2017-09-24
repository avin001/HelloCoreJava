package com.example.java;

public class SimpleExample_instanceofOperator {

    public static void main(String[] args) {

        /*
        The java instanceof operator is used to test whether the object is an instance of the
        specified type (class or subclass or interface).

        The instanceof in java is also known as type comparison operator because it compares the instance
        with type. It returns either true or false. If we apply the instanceof operator with any variable that
        has null value, it returns false.

        This is a simple example of instance operator where it tests the current class.
         */

        SimpleExample_instanceofOperator s = new SimpleExample_instanceofOperator();
        System.out.println(s instanceof SimpleExample_instanceofOperator);
    }
}
