package com.example.java;

import com.example.sample.HelloAll;

public class PublicAccessModifierExample {

    public static void main(String[] args) {

        /*
        In this example, we have created two packages com.example.java and com.example.sample
        We are accessing public HelloAll class from outside its package. Since HelloAll class is  public,
        so it can be accessed from outside the package or rather anywhere.
        The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
         */

        HelloAll hello = new HelloAll();
        hello.message();
    }
}
