package com.rechingskies.basicjava.javaoops;

import com.rechingskies.basicjava.introduction.CommandLineArguments;

public class ClassAndObjectDemo {

    public static void main(String [] args) {
        Complex complex = new Complex(10,20);
        complex.print();
        Complex complex1 = new Complex(20,40);
        complex.add(complex1);
        complex.print();
    }
}

class Complex {
    int image;
    int real;
    Complex(int i, int r) {
        image = i;
        real = r;
    }

    void print() {
        System.out.println(image+"+i"+real);
    }

    void add(Complex complex) {
        image = image+ complex.image;
        real = real+ complex.real;
    }
}
