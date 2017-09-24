package com.example.java;

import com.sun.org.apache.xpath.internal.operations.Mod;

class Module {
}

public class AnotherExample_instanceofOperator extends Module {

    public static void main(String[] args) {

        /*
        An object of subclass type is also a type of parent class. For example, if Dog extends Animal
        then object of Dog can be referred by either Dog or Animal class.
         */

        AnotherExample_instanceofOperator example = new AnotherExample_instanceofOperator();
        System.out.println(example instanceof Module);
    }
}
