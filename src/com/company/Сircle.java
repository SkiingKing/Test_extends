package com.company;

public class Сircle extends Figure {
    private double r;
    public Сircle(double r){
        this.r=r;

    }

    public double getR(){
        return r;
    }
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return p*(r*r);
    }
}
