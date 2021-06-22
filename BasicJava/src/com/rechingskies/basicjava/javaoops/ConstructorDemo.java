package com.rechingskies.basicjava.javaoops;

public class ConstructorDemo {
    public static void main(String [] args) {
        //Student student = new Student(); It wont compile
        Student student = new Student("Hello","World");
        student.print();
    }
}

class Student {
    String firstName;
    String lastName;
    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void print() {
        System.out.println(firstName+" "+lastName);
    }
}
