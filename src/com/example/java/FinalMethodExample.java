package com.example.java;

class Bike {
    public final void run() {
        System.out.println("Running");
    }
}

public class FinalMethodExample extends Bike {

    public static void main(String[] args) {

        /*
        public void run() {
        System.out.println("Running");
        }

        'run()' cannot override 'run()' in 'com.example.java.Bike'; overridden method is final
         */

        FinalMethodExample f = new FinalMethodExample();
        f.run();

    }
}
