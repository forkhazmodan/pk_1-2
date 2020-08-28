package com.kp.chukhnovm.hw1_2;

public class Main {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5,5,5);
        Triangle triangle2 = new Triangle(-1,-2,-4);
        Triangle triangle3 = new Triangle(0,2,3);
        Triangle triangle4 = new Triangle(5255,255,1);

        System.out.println(triangle1.getArea()); // 10.83
        System.out.println(triangle2.getArea()); // 0
        System.out.println(triangle3.getArea()); // 0
        System.out.println(triangle4.getArea()); // 0
    }
}
