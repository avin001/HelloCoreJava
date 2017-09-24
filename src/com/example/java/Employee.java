package com.example.java;

public class Employee {

    int id;
    String email;
    String department;

    /*
    Suppose there are 15000 employees in my organization in IT department, now all instance data members
    will get memory each time when object is created. All employees have their unique id's
    and email so instance data member is good. Here, department refers to the common property of all objects.
    If we make it static, this field will get memory only once.
    Refer corrected class Employee57
     */
}
