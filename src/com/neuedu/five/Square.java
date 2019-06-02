package com.neuedu.five;

public class Square {
    public double side;
    public double getSide() {
        return side;
    }
    public void setSide(double l) {
        side=l;
    }
    public double caculatePerimeter() {
        return 4*side;
    }
    public double caculateArea(){
        return side*side;
    }
}
