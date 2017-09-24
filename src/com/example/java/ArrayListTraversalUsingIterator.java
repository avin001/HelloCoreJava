package com.example.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversalUsingIterator {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Steve");
        list.add("Martin");
        list.add("June");
        list.add("Greg");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
