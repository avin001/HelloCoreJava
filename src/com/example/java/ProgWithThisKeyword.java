package com.example.java;

public class ProgWithThisKeyword {

    /*
    Output:
    Roll No. 23, Name: Steve, Fee: 4500.33984375
    Roll No. 34, Name: Martin, Fee: 12000.0
     */

    int rollNo;
    String name;
    double fee;

    public ProgWithThisKeyword(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    public void display() {
        System.out.println("Roll No. " + rollNo + ", " + "Name: " + name + ", " + "Fee: " + fee);
    }

    public static void main(String[] args) {

        ProgWithThisKeyword p1 = new ProgWithThisKeyword(23, "Steve", 4500.34f);
        ProgWithThisKeyword p2 = new ProgWithThisKeyword(34, "Martin", 12000.00f);

        p1.display();
        p2.display();
    }
}
