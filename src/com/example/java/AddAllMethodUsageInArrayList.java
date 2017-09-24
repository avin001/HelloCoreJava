package com.example.java;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAllMethodUsageInArrayList {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Steve");
        list1.add("Martin");
        list1.add("June");
        list1.add("Greg");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Rachel");
        list2.add("Mark");
        list2.add("Josh");
        list2.add("Summer");

        list1.addAll(list2);

        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
