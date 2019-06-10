package com.neuedu.six;
/**
 * 6、定义测试类，使用多态的形式分别创建学生类型的对象,
 * 主持人类型的对象，班级类型的对象（这个对象非多态），使用班级对象调用开晚会的方法；
 *    显示要求：女士们，先生们，大家好，我是主持人......
 * 晚会正式开始....
 * 我是男同学，我嗑瓜子，喝啤酒...
 * */
public class StudentTest {
    public static void main(String[] args) {
        Student c=new StudentMan();
        Compere C=new StudentWomen();
        Grade G=new Grade();
        G.kaibanhui(C,c);
    }
}
