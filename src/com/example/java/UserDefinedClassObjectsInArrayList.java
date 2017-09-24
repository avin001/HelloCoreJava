package com.example.java;

import java.util.ArrayList;
import java.util.Iterator;

class Engineer {

    String name;
    int id, age;

    public Engineer(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

public class UserDefinedClassObjectsInArrayList {

    public static void main(String[] args) {

        Engineer er1 = new Engineer("Ryan", 2342, 32);
        Engineer er2 = new Engineer("Harry", 2323, 35);
        Engineer er3 = new Engineer("George", 4554, 45);

        ArrayList<Engineer> list = new ArrayList<>();
        list.add(er1);
        list.add(er2);
        list.add(er3);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Engineer er = (Engineer)itr.next();
            System.out.println("Name: " + er.name + ", " + "id: " + er.id + ", " + "Age: " + er.age);
        }
    }
}
