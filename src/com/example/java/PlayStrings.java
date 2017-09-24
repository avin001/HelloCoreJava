package com.example.java;

public class PlayStrings {

    public static void main(String[] args) {

        String firstName = "Avin";
        char fName[] = {'A', 'V', 'I', 'N'};
        String helpingVerb = "is";
        int age = 35;

        System.out.println(firstName);
        System.out.println(firstName.length());
        System.out.println(firstName.toUpperCase());
        System.out.println(fName);
        System.out.println(firstName.equals(fName));
        System.out.println(firstName + " " + helpingVerb + " " + age + ".");

    }
}
