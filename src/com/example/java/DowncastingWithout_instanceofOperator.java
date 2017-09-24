package com.example.java;

class Metal {
}

class Iron extends Metal {
    public static void tensileStrength(Metal m) {
        Iron i = (Iron)m;   //  downcasting
        System.out.println("Downcasting performed.");
    }
}

public class DowncastingWithout_instanceofOperator {

    public static void main(String[] args) {
        Metal m = new Iron();
        Iron.tensileStrength(m);
    }
}
