package com.neuedu.test;

public class Notebook {
    //2、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
    //2.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
    //2.2 输出笔记本信息的方法 3.3 然后编写一个测试类，测试笔记本类的各个方法。
    private char    color;
    private int     cpu;
    //无参
    public Notebook(){
        color='黑';
        cpu=002;
    }
    //有参
    public Notebook(char    color,int   cpu){
        this.color=color;
        this.cpu=cpu;
    }

    @Override
    public String toString() {
        return "颜色为："+color+"  "+"cpu型号为："+cpu;
    }

}
