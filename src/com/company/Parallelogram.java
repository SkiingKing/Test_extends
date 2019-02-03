package com.company;

public class Parallelogram extends Figure {

    private int a;
    private int h;
    private int b;
    private int c;
    private int d;
    public Parallelogram(){
        this.a=a;
        this.h=h;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public int getA(){
        return a;

    }
    public int getB(){
        return b;

    }
    public int getC(){
        return c;

    }
    public int getD(){
        return d;

    }
    public int getH(){
        return h;
    }
    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }

    @Override
    public double getArea() {
        return a*h;
    }
}
