package com.javatechie;

class Employee extends Person{

    Employee(String name, int age) {
        //fndfjkdfjkhfd
        if(age>18) {
            System.out.println("Eligible for job");
        }
        super(name, age);
        System.out.println("Employee constructor called");
    }

}
//Scoped Values (JEP 506) :