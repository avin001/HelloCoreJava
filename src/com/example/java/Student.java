package com.example.java;

public class Student {

    int id;
    String name;
    int age;

    // default constructor with user provided println
    public Student() {
        System.out.println("In default constructor.");
    }

    // constructor 2
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
    constructor 3 to demonstrate operator overloading - constructor 3 with same name as constructor 2 but
    with different parameters
     */
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayStudentDetails() {
        System.out.println("Student id: " + id + ", " + "Student name: " + name +
                           ", " + "Student age: " + age);
    }
}
