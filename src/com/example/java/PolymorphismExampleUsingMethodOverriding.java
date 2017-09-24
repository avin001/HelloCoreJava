package com.example.java;

class Bank {
    float getInterestRate() {
        return 7.5f;
    }
}

class Pnb extends  Bank {
    float getInterestRate() {
        return 8.5f;
    }
}

class Icici extends Bank {
    float getInterestRate() {
        return 7.45f;
    }
}

class Sbi extends Bank {
    float getInterestRate() {
        return 8.45f;
    }
}

public class PolymorphismExampleUsingMethodOverriding {

    public static void main(String[] args) {

        Bank pnb = new Pnb();
        Bank icici = new Icici();
        Bank sbi = new Sbi();

        System.out.printf("Interest rate of Pnb is %2.2f%n", pnb.getInterestRate());
        System.out.printf("Interest rate of Icici is %2.2f%n", icici.getInterestRate());
        System.out.printf("Interest rate of Sbi is %2.2f%n", sbi.getInterestRate());
    }
}
