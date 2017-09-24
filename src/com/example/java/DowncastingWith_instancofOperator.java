package com.example.java;

class Material {

}

class Cotton extends Material {

    public static void fibre(Material m) {
        if (m instanceof Cotton) {
            Cotton c = (Cotton)m;   //  downcasting
            System.out.println("Downcasting performed.");
        }
    }
}

public class DowncastingWith_instancofOperator {

    public static void main(String[] args) {
        Material m = new Cotton();
        Cotton.fibre(m);

    }
}
