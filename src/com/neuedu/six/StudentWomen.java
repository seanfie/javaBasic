package com.neuedu.six;
/**
 * 4、定义女同学类，继承学生类，同时实现主持人接口，主持方法的内容为：
 * ”女士们，先生们，大家好，我是主持人......”，
 * 吃的方法内容为：”我是女同学，我嗑瓜子，吃水果...”;
 * */
public class StudentWomen extends Student implements  Compere {
    public void chi(){
        System.out.println("我是女同学，我嗑瓜子，吃水果...");
    }
    public void Com(){
        System.out.println("女士们，先生们，大家好，我是主持人......");
    }
}
