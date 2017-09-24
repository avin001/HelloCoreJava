package com.example.java;

public class Employee57 {

    int id;
    String email;
    static String department = "IT";

    public Employee57(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public void display() {
        System.out.println("id: " + id + ", " + "email: " + email + ", " +
                           "department: " + department);
    }

    public static void main(String[] args) {

        Employee57 e1 = new Employee57(231, "e231@syncmail.com");
        Employee57 e2 = new Employee57(345, "e345@syncmail.com");

        e1.display();
        e2.display();
    }
}
