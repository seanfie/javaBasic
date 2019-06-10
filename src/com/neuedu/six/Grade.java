package com.neuedu.six;
/**
 * 5、定义班级类，提供一个无返回值的，带两个参数的开晚会的方法，
 * 其中第1个参数为主持人接口类型，第二个参数为学生类型，方法内容中要求先调用主持人的主持方法，
 * 再打印一句话”晚会正式开始.....”,然后调用学生的吃的方法；
 * */
public class Grade {
    public void kaibanhui(Compere C, Student c){
        //先调用主持的方法
        C.Com();
        //打印的话
        System.out.println("晚会正式开始.....");
        c.chi();
    }
}
