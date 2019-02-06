package com.company;

public class Parallelogram extends Figure {

    private int a;
    private int h;
    private int b;
    private int c;
    private int d;

    public Parallelogram(int a, int b, int h, int c, int d) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;

    }

    public int getB() {
        return b;

    }

    public int getC() {
        return c;

    }

    public int getD() {
        return d;

    }

    Parallelogram pa = new Parallelogram(10, 8, 7, 8, 8);

    @Override
    public int hashCode() {
        return 23 * pa.hashCode();
    }

    @Override
    public String toString() {

        return "Parallelogram" + a + h + b + c + d;
    }

    public int getH() {
        return h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return a * h;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
