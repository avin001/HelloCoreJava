package com.example.java;

public class ProgWithoutThisKeyword {

    /*
    Output:
    Roll No. 0, Name: null, Fee: 0.0
    Roll No. 0, Name: null, Fee: 0.0
     */

    int rollNo;
    String name;
    double fee;

    public ProgWithoutThisKeyword(int rollNo, String name, float fee) {
        rollNo = rollNo;
        name = name;
        fee = fee;
    }

    public void display() {
        System.out.println("Roll No. " + rollNo + ", " + "Name: " + name + ", " + "Fee: " + fee);
    }

    public static void main(String[] args) {

        ProgWithoutThisKeyword p1 = new ProgWithoutThisKeyword(23, "Steve", 4500.34f);
        ProgWithoutThisKeyword p2 = new ProgWithoutThisKeyword(34, "Martin", 12000.00f);

        p1.display();
        p2.display();

    }

}
