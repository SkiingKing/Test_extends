package com.company;

public class Trapeze extends Figure {

    private int a, b, c, d, h;

    public Trapeze(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    Trapeze t = new Trapeze(8, 10, 6, 6, 7);

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

    public int getH() {
        return h;
    }

    @Override
    public String toString() {

        return "Trapeze" + a + b + c + d + h;
    }

    @Override
    public int hashCode() {
        return 23 * t.hashCode();
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return (a * b) / 2 * h;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
