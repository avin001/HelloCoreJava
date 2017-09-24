package com.example.java;

class SeniorDeveloper {

    public void writeCode() {
        System.out.println("Writes code.");
    }

    public void verifyCode() {
        System.out.println("Verifies code of junior developers.");
    }
}

public class UserSuperToInvokeParentClassMethod extends  SeniorDeveloper {

    public void verifyCode() {
        System.out.println("Verifies code written by self.");
    }

    public void developersTasks() {

        System.out.println("Tasks that a junior developer is expected to perform: ");
        super.writeCode();
        verifyCode();
        System.out.println("Tasks that a senior developer is expected to perform: ");
        super.writeCode();
        super.verifyCode();
    }

    public static void main(String[] args) {

        UserSuperToInvokeParentClassMethod obj = new UserSuperToInvokeParentClassMethod();
        obj.developersTasks();

    }
}
