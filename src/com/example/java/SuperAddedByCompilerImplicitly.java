package com.example.java;

/*
    super() is added in each class constructor automatically by compiler if there is no super() or this().
    As we know well that default constructor is provided by compiler automatically if there is no constructor.
    But, it also adds super() as the first statement.
    Example of super keyword where super() is provided by the compiler implicitly.

 */

class QualityAssurance {

    public QualityAssurance() {
        System.out.println("This is Quality Assurance.");
    }
}

public class SuperAddedByCompilerImplicitly extends QualityAssurance {

    public SuperAddedByCompilerImplicitly() {
        System.out.println("This is Automation Testing.");
    }

    public static void main(String[] args) {
        SuperAddedByCompilerImplicitly obj = new SuperAddedByCompilerImplicitly();
    }
}
