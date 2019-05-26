package com.neuedu.test;
/**
 * 3.利用条件运算语句的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
 * */
public class WorkTwo_03 {
    public static void main(String[] args) {
        int i = 99;
        if (i > 100 || i < 0) {
            System.out.println("你输入的成绩无效，请重新输入");
        } else {
            if (i > 90) {
                System.out.println("你的成绩等级是：A");
            } else if (i < 90 && i > 59) {
                System.out.println("你的成绩等级是：B");
            } else {
                System.out.println("你的成绩等级是：C");
            }
        }
    }
}
