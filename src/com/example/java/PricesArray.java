package com.example.java;

import java.util.Scanner;

public class PricesArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] pricesOfItemsYouWannaPurchase = new double[5];
        System.out.println("Please enter the prices for 5 items you want to purchase: ");
        pricesOfItemsYouWannaPurchase[0] = scanner.nextDouble();
        pricesOfItemsYouWannaPurchase[1] = scanner.nextDouble();
        pricesOfItemsYouWannaPurchase[2] = scanner.nextDouble();
        pricesOfItemsYouWannaPurchase[3] = scanner.nextDouble();
        pricesOfItemsYouWannaPurchase[4] = scanner.nextDouble();
        double totalPrice = pricesOfItemsYouWannaPurchase[0] + pricesOfItemsYouWannaPurchase[1] +
                            pricesOfItemsYouWannaPurchase[2] + pricesOfItemsYouWannaPurchase[3] +
                            pricesOfItemsYouWannaPurchase[4];
        System.out.printf("The sum total of prices of all the 5 items you want to purchase is $%5.2f", totalPrice);
    }
}
