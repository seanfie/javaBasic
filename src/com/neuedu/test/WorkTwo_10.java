package com.neuedu.test;

import java.util.Scanner;

/**
 * 10.一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
 * */
public class WorkTwo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        boolean flag = false;
        int i=0;
        while(a%10>0){
            i += a%10;
            a = a/10;
        }
        i = i + a;
        if(i%9==0){
            flag = true;
        }
        System.out.println(flag?"能被9整除":"不能被9整除");
    }
}
