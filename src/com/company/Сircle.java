package com.company;

import javafx.scene.shape.Circle;

public class Сircle extends Figure {
    private double r;

    public Сircle(double r) {
        this.r = r;

    }

    Circle c = new Circle(5);

    @Override
    public String toString() {

        return "Circle" + r;
    }

    @Override
    public int hashCode() {
        return c.hashCode() + 9;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return p * (r * r);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
