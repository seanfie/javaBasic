package com.neuedu.test;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0){
            this.radius = radius;
        }else {
            System.out.println("请输入一个大于0的数");
        }
    }

    public void girth(){
        double g=2*Math.PI*radius;
        System.out.println("圆形周长："+g);
    }

    public void area(){
        double a=Math.PI*(Math.pow(radius,2));
        System.out.println("圆形面积："+a);
    }

}
