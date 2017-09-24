package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Refer Person class for the code below
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many person's information do you want the system the store?: ");
        int number = scanner.nextInt();
        Person[] personArray = new Person[number];
        for (int i = 1; i <= number; i++) {
            Person person = new Person();

            System.out.printf("Please enter the id of person%d: ", i);
            person.setId(scanner.nextLong());
            scanner.nextLine();  //necessary to do due to Enter key pressed by user

            System.out.printf("Please enter the name of the person%d: ", i);
            person.setName(scanner.next());
            scanner.nextLine();  //necessary to do due to Enter key pressed by user

            System.out.printf("Please enter the age of the person%d: ", i);
            person.setAge(scanner.nextInt());
            scanner.nextLine();  //necessary to do due to Enter key pressed by user

            System.out.printf("Please enter a short bio of the person%d: ", i);
            person.setBio(scanner.nextLine());

            personArray[i - 1] = person;
        }
        System.out.printf("System has stored the information of %d persons as provided below: %n", number);
        for (Person p:personArray
             ) {
            System.out.println("id: " + p.getId() + ", " + "name: " + p.getName() + ", " +
                              "age: " + p.getAge() + ", " + "bio: " + p.getBio());
        }

        System.out.println("-------------------------------------------------------------");

        // Refer Student class for the code below
        Student student1 = new Student();
        Student student2 = new Student(122, "Avin");
        Student student3 = new Student(123, "Nidhi", 32);
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Refer ConstructorChainingUsingThis class for the code below
        ConstructorChainingUsingThis c1 = new ConstructorChainingUsingThis(2323, "Avin", "Java");
        ConstructorChainingUsingThis c2 = new ConstructorChainingUsingThis(7676, "Nidhi", "Java");
        c1.display();
        c2.display();
        ConstructorChainingUsingThis c3 = new ConstructorChainingUsingThis(9767, "Greg", "Data Science", 17000.00f);
        ConstructorChainingUsingThis c4 = new ConstructorChainingUsingThis(3499, "Paula", "Kotlin",  4500.00f);
        c3.display();
        c4.display();

    }
}
