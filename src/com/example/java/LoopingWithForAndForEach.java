package com.example.java;

import java.util.Scanner;

public class LoopingWithForAndForEach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] techSkills = new String[5];
        String[] bucketList = new String[5];

        // Instantiate array with your top 5 technical skills.
        int i = 0;
        do {
            System.out.printf("Please provide skill %d: ", (i + 1));
            techSkills[i] = scanner.nextLine();
            i++;
        } while (i < techSkills.length);

        // Print the elements of the array using for loop
        System.out.println("The top 5 skills you entered are: ");
        for (int j = 0; j<techSkills.length; j++) {
            System.out.println(techSkills[j]);
        }

        System.out.println("**********************************************************");

        // Instantiate bucket list with your top 5 to-do's in life
        int x = 0;
        do {
            System.out.printf("Please provide your to-do number %d for your bucket list: ", (x + 1));
            bucketList[x] = scanner.nextLine();
            x++;
        } while (x < bucketList.length);

        // Print elements of your bucket list array using for-each loop
        System.out.println("The top 5 items you entered in your bucket list are: ");
        for (String listItem:bucketList
             ) {
            System.out.println(listItem);
        }
    }
}
