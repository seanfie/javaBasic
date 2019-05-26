package com.neuedu.test;
/**
 * 2.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * */
public class WorkTwo_02 {
    public static void main(String[] args){

        for(int i=100;i>=100&&i<999;i++){
            int a=i/100;
            int b=(i-a*100)/10;
            int c=i%10;
            System.out.println(i);
            System.out.println("百位是"+a);
            System.out.println("十位是"+b);
            System.out.println("个位是"+c);
            }
        }
    }

