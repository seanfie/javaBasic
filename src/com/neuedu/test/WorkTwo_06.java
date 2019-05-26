package com.neuedu.test;

import java.util.Scanner;

/**
 * 6.一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * */
public class WorkTwo_06 {
    public static void main(String[] args){
        System.out.println("请输入一个五位正整数:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<10000 && num>=100000){
            System.out.println("输入的不是五位正整数!");
            return;
        }
        int a=num/10000;
        int b=num/1000%10;
        int c=num/100%10;
        int d=num/10%10;
        int e=num%10;
        if(a==e && b==d){
            System.out.println(num+"是回文数");
        }else{
            System.out.println(num+"不是回文数");
        }

    }
}