package com.example.java;

public class ConstructorChainingUsingThis {

    int rollNo;
    String name,course;
    float fee;

    public ConstructorChainingUsingThis(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public ConstructorChainingUsingThis(int rollNo, String name, String course, float fee) {
        /*
        Rule: Call to this() must be the first statement in constructor.
        If the mentioned rule is not followed, user observes the following error.
        Compile Time Error: Call to this must be first statement in constructor.
         */
        this(rollNo, name, course); // Reusing constructor
        this.fee = fee;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", " + "Name: " + name + ", " + "Course: " + course +
                           ", " + "Fee: " + fee);
    }
}

