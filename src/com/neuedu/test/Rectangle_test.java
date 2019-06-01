package com.neuedu.test;
/**
 * 1 定义长方形类，含：
 *   特征：宽、高（整型）；
 *   方法：求周长、面积；
 *   方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
 * 并对其进行测试
 * */
class Rectangle_test {
    private int width;
    private int height;

    public  void  circumference1(){
        width=1;
        height=1;
         int cir1=2*(width+height);
         int area1=width*height;
        System.out.println("无参的周长："+cir1+";无参的面积："+area1);
    }
    public void  ciecumference2(int one){
          width=one;
          height=one;
          int cir2=2*one;
          int area2=one*one;
        System.out.println("一个参数的周长："+cir2+";一个参数的面积："+area2);
    }
    public void   ciecumference3(int width ,int height){
        int cir3= 2*(width+height);
        int area3=width*height;
        System.out.println("两个参数的周长："+cir3+";两个参数的面积："+area3);

    }


}
