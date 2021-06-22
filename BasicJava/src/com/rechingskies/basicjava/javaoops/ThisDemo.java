package com.rechingskies.basicjava.javaoops;

public class ThisDemo {
    public static void main(String [] args) {
        Points points = new Points();
        points.print();
        Points points1 = new Points(10,20);
        points1.print();
    }
}
class Points {
    int x;
    int y;
    Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Points() {
        this(10,10);
    }
    void print() {
        System.out.println(this.x+" "+this.y);
    }
}
