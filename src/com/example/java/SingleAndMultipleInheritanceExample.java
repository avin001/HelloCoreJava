package com.example.java;

public class SingleAndMultipleInheritanceExample {

    public static void main(String[] args) {

        AddSubMultiply obj = new AddSubMultiply();
        obj.num1 = 5;
        obj.num2 = 4;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.multiply();
        System.out.println(obj.result);
    }

}

    class Add {
        int num1, num2, result;

        public void sum() {
            result = num1 + num2;
        }
    }

    class AddSub extends Add {      // Single level inheritance

        public void sub() {
            result = num1 - num2;
        }
    }

    class AddSubMultiply extends  AddSub {      // Multi-level inheritance

        public void multiply() {
            result = num1 * num2;
        }
    }
