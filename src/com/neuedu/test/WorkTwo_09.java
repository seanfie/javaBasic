package com.neuedu.test;
/**
 *
 *   9 . 用 while 循环，计算 1~200 之间所有 3 的倍数之和。
 * */
public class WorkTwo_09 {
    public static  void main(String[] args){
        int a = 0;
        int i = 1;
        while(i>0&&i<200){
            if(i % 3 == 0){
                a+= i;
            }
            i++;
        }
        System.out.println("1~200之间所有3的倍数之和是：" + a);
    }

}

