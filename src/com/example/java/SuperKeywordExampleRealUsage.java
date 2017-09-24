package com.example.java;

class StudentMartin {

    int id;
    String name;

    public StudentMartin(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SuperKeywordExampleRealUsage extends StudentMartin {

    float salary;

    public SuperKeywordExampleRealUsage(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("id: " + id + ", " + "name: " + name + ", " + "salary: " + salary);
    }

    public static void main(String[] args) {

        SuperKeywordExampleRealUsage obj = new SuperKeywordExampleRealUsage(1312, "Steve", 40000f);
        obj.displayDetails();
    }
}
