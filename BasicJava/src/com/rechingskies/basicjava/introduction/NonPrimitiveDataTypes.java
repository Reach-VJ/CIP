package com.rechingskies.basicjava.introduction;

public class NonPrimitiveDataTypes {
    public static void main(String [] args) {
        Points points = new Points();
        System.out.println(points.x+" "+points.y);//Print default values if you do not initialize.
    }
}

class Points {
    int x;
    int y;
}
