package com.example.java;

abstract class LearnProgramming {

    public void code() {
        System.out.println("Code, code and code. Code to build something you visualize. " +
                           "This is the best way to learn programming.");
    }
}

class LearnJava extends LearnProgramming {

}

public class AbstractClassWithoutAbstractMethodExample {

    public static void main(String[] args) {

        LearnProgramming java = new LearnJava();
        java.code();
    }
}
