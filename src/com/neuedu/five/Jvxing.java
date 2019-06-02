package com.neuedu.five;

    public class Jvxing extends Shape
    {
        //定义新的成员方法用来求周长
        public String qiuZC(double chang, double kuan)
        {
            if(chang>0&&kuan>0)
                return "矩形的周长为："+2*(chang+kuan);
            else
                return "该矩形的长和宽不合法，长和宽必须大于0";

        }
    }

