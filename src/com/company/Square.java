package com.company;

import com.company.RavnoStotoniyTriangle;
import com.company.Triangle;

public final class Square extends Figure {
    private final int x;
    private Triangle triangle;
    private Square square;

    public Square(int x) {
        this.x = x;
    }

    public Square(RavnoStotoniyTriangle triangle) {
        this.x = triangle.getX();
    }

    Square s = new Square(10);

    public RavnoStotoniyTriangle getTriangle() {
        RavnoStotoniyTriangle triangle = new RavnoStotoniyTriangle(x);
        return triangle;
    }

    @Override
    public double getPerimeter() {
        return 4 * x;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "square" + x;
    }

    @Override
    public int hashCode() {

        return 100 * s.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}