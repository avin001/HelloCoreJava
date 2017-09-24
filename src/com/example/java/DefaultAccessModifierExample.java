package com.example.java;

public class DefaultAccessModifierExample {

    public static void main(String[] args) {

        //  Hello h = new Hello();
        //  Compile Time Error - Cannot resolve symbol 'Hello'
        //  h.message();
        //  Compile Time Error - Cannot resolve symbol 'h'
        /*
        In this example, we have created two packages com.example.java and com.example.sample
        We are accessing the Hello class from outside its package. Since Hello class is not public,
        so it cannot be accessed from outside the package.
        The scope of class Hello and its method message() is default so it cannot be accessed from outside the package.
         */
    }
}
