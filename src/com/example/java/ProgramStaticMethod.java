package com.example.java;

public class ProgramStaticMethod {

    //Program of changing the common property of all objects(static field).

    int id;
    String email;
    static String department = "IT";

    public ProgramStaticMethod(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public static void change(String departmentName) {
        department = departmentName;
    }

    public void display() {
        System.out.println("id: " + id + ", " + "email: " + email + ", " +
                "department: " + department);
    }

    public static void main(String[] args) {

        ProgramStaticMethod.change("Finance");

        ProgramStaticMethod p1 = new ProgramStaticMethod(322, "e322@synergymail.com");
        ProgramStaticMethod p2 = new ProgramStaticMethod(456, "e456@synergymail.com");
        ProgramStaticMethod p3 = new ProgramStaticMethod(679, "e679@synergymail.com");

        p1.display();
        p2.display();
        p3.display();

        ProgramStaticMethod.change("Human Resources");

        p1.display();
        p2.display();
        p3.display();
    }
}
