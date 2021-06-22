package com.rechingskies.basicjava.javaoops;

public class StaticDemo {
    static String name = "Hello";
    public static void main(String [] args) {
        //Static members can access without creating an object
        //Static methods can not access not static members
        //Non static methods can access static members
        //Static members do not have access to this reference.
        //print(); Cant access.
    }

    void print() {
        System.out.println("Hello");
        System.out.println(name); // Static member can be accessible here.
        printDetails(); // Not static methods can access static methods
    }

    static void printDetails() {
        System.out.println("Hello World");
    }

}
