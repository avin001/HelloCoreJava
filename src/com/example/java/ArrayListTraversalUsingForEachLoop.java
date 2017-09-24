package com.example.java;

import java.util.ArrayList;

public class ArrayListTraversalUsingForEachLoop {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Rachel");
        list.add("Mark");
        list.add("Josh");
        list.add("Summer");

        for (String name:list
             ) {
            System.out.println(name);
        }
    }
}
