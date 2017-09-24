package com.example.java;

import com.example.sample.Greetings;

public class ProtectedAccessModifierExample extends Greetings {

    public static void main(String[] args) {

        /*
        In this example, we have created two packages com.example.java and com.example.sample
        The Greetings class of com.example.sample package is public, so can be accessed from outside the package.
        But messge method of this package is declared as protected, so it can be accessed from outside the class
        only through inheritance.
         */

        ProtectedAccessModifierExample p = new ProtectedAccessModifierExample();
        p.message();
    }
}
