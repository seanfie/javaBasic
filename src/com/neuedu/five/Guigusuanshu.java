package com.neuedu.five;

import java.util.Scanner;

public class Guigusuanshu {
        public static void main(String[] args)  {
            System.out.println("请输入一个自然数");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            for(int i=0;;i++){
                if(a%2==0) {
                    //引用为奇数时的函数
                    a=ou(a);
                }
                else {
                    //引用为偶数时的函数
                    a=ji(a);
                }
                if(a==1) {
                    System.out.println("经过"+i+"次计算后");
                    break;
                }
            }
            System.out.println("得到"+a);
        }
        public static int ji(int a) {
            int b=a*3+1;
            return b;
        }
        public static int ou(int a) {
            int b=a/2;
            return b;
        }

    }


