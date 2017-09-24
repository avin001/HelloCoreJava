package com.example.java;

class SoftwareDevelopmentTeam {

    public SoftwareDevelopmentTeam() {
        System.out.println("Hire Developers, QA, Analysts");
    }

}

public class UseSuperToInvokeParentClassConstructor extends SoftwareDevelopmentTeam {

    public UseSuperToInvokeParentClassConstructor() {

        super();
        System.out.println("Start development cycle.");
    }

    public static void main(String[] args) {

        UseSuperToInvokeParentClassConstructor obj = new UseSuperToInvokeParentClassConstructor();
    }
}
