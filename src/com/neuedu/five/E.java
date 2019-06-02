package com.neuedu.five;


    public class E {

        public static void main(String[] args) {

            //实例化三角形对象
            Sanjiao sj = new Sanjiao();
            System.out.println(sj.qiuZC(5, 5.6, 8));
            System.out.println(sj.qiuZC(5, 5.6, 25.2));


            //实例化矩形对象
            Jvxing jx= new Jvxing();
            System.out.println(jx.qiuZC(5, 5.6));
            System.out.println(jx.qiuZC(28, 0));

        }

    }

