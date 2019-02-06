package com.company;

public class Pentagon extends Figure {

    private int a;

    public Pentagon(int a) {
        this.a = a;
    }

    Pentagon p = new Pentagon(2);

    @Override
    public String toString() {

        return "Pentagon" + p;
    }

    public int getA() {
        return a;
    }

    @Override
    public double getPerimeter() {
        return 5 * a;
    }

    @Override
    public int hashCode() {
        return 54 * p.hashCode();
    }

    @Override
    public double getArea() {
        return (Math.sqrt(25 + 10 * Math.sqrt(5)) / 4) * (a * a);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
