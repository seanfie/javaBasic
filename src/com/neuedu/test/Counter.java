package com.neuedu.test;

public class Counter {
    public static void main(String[] args) {
        counter_test counter=new counter_test();
        double add0=counter.add(5,5);
        double sub0=counter.sub(5,5);
        double mul0=counter.mul(5,5);
        double div0=counter.div(5,5);
        System.out.println("加法运算是："+add0+"；减法运算是："+sub0+"；乘法运算是："+mul0+"；除法运算是："+div0);

    }
}
