package com.neuedu.test;
/**
 *
 定义一个乐器类 Instrument 有乐器演奏方法play（）
 子类Wind 和Brass类 对乐器类演奏方法进行方法重写 定义自己的演奏方式
 3 创建main方法 进行测试

 * */
public class Instrument {
    private String name;

    public void play(){
        System.out.println("正在用"+name+"演奏");
    }

}





