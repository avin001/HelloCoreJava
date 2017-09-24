package com.example.java;

class Sample {

    private Sample() {
    }

    void message() {

        System.out.println("Hello Java!");
    }
}

public class RoleOfPrivateConstructor {

    public static void main(String[] args) {

        //  Sample s = new Sample();
        // 'Sample()' has private access in com.example.java.Sample
        /*
        If you make any class constructor private, you cannot create the instance of
        that class from outside the class.
         */

    }
}
