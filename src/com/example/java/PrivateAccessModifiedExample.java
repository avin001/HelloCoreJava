package com.example.java;

class Simple {
    private int data = 40;

    private void message() {
        System.out.println("Hello Java!");
    }
}

public class PrivateAccessModifiedExample {

    public static void main(String[] args) {

        Simple s = new Simple();
//      System.out.println(s.data);
//      Compile Time Error - 'data' has private access in 'com.example.java.Simple'
//      s.message();
//      Compile Time Error - 'message()' has private access in 'com.example.java.Simple'

    }
}
