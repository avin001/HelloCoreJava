package com.example.java;

interface Printable {

    void print();
}

public class Example1JavaInterface implements Printable {

    public void print() {
        System.out.println("In this example, Printable interface has only one method. " +
                           "Its implementation is provided in the Example1JavaInterface class.");
    }

    public static void main(String[] args) {

        Example1JavaInterface obj = new Example1JavaInterface();
        obj.print();
    }
}
