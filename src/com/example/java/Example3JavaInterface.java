package com.example.java;

interface BankLoan {

    float getRateOfInterest();
}

class PnbLoanDept implements BankLoan {

    public float getRateOfInterest() {
        return 7.50f;
    }
}

class SbiLoanDept implements BankLoan {

    public float getRateOfInterest() {
        return 7.85f;
    }
}

class IciciLoanDept implements BankLoan {

    public float getRateOfInterest() {
        return 9.45f;
    }
}

public class Example3JavaInterface {

    public static void main(String[] args) {

        BankLoan bankLoan1 = new PnbLoanDept();
        System.out.printf("ROI of PNB: %2.2f%n", bankLoan1.getRateOfInterest());
        BankLoan bankLoan2 = new SbiLoanDept();
        System.out.printf("ROI of SBI: %2.2f%n", bankLoan2.getRateOfInterest());
        BankLoan bankLoan3 = new IciciLoanDept();
        System.out.printf("ROI of ICICI: %2.2f%n", bankLoan3.getRateOfInterest());
    }
}
