package com.example.java;

public class ProgCounterWithStaticVar {

    static int count = 0; // will get instance when memory is created

    public ProgCounterWithStaticVar() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        ProgCounterWithStaticVar p1 = new ProgCounterWithStaticVar();
        ProgCounterWithStaticVar p2 = new ProgCounterWithStaticVar();
        ProgCounterWithStaticVar p3 = new ProgCounterWithStaticVar();

        /*
        Output: 1
                2
                3

         */
    }
}
