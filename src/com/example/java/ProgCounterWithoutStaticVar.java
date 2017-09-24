package com.example.java;

public class ProgCounterWithoutStaticVar {

    int count = 0; // will get instance when memory is created

    public ProgCounterWithoutStaticVar() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        ProgCounterWithoutStaticVar p1 = new ProgCounterWithoutStaticVar();
        ProgCounterWithoutStaticVar p2 = new ProgCounterWithoutStaticVar();
        ProgCounterWithoutStaticVar p3 = new ProgCounterWithoutStaticVar();

        /*
        In this example, we have created an instance variable named count which is incremented
        in the constructor. Since instance variable gets the memory at the time of object creation,
        each object will have the copy of the instance variable, if it is incremented, it won't reflect
        in other objects. So each objects will have the value 1 in the count variable.
        Output: 1
                1
                1

         */
    }
}
