package com.company;

import com.company.Figure;

public class Triangle extends Figure {
    protected final int x, y, z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Triangle t = new Triangle(5, 7, 9);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Triangle" + x + y + z;
    }

    @Override
    public int hashCode() {
        return t.hashCode() + 1;
    }

    @Override
    public double getPerimeter() {
        return x + z + y;
    }

    @Override
    public double getArea() {

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}