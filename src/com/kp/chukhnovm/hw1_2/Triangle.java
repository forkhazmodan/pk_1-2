package com.kp.chukhnovm.hw1_2;

public class Triangle {

    private double b;
    private double c;
    private double a;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.b = b > 0 ? b : 0;
        this.c = c > 0 ? c : 0;
        this.a = a > 0 ? a : 0;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {

        double P = a + b + c;
        double halfP = P / 2;

        return round(Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c)));
    }

    private double round(double num) {
        return Math.round(num * 100d) / 100d;
    }
}
