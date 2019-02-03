package com.company;

public class pentagon extends Figure {

    private int a;
    public pentagon(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    @Override
    public double getPerimeter() {
        return 5*a;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(25+10*Math.sqrt(5))/4)*(a*a);
    }
}
