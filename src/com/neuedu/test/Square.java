package com.neuedu.test;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side>0){
            this.side = side;
        }else {
            System.out.println("请输入一个大于0的数");
        }
    }

    public void girth(){
        double g=side*4;
        System.out.println("正方形周长："+g);
    }

    public void area(){
        double a=Math.pow(side,2);
        System.out.println("正方形面积："+a);
    }

}
