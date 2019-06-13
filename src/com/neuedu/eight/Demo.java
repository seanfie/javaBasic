package com.neuedu.eight;
//从键盘获取一行输入字符串，要求去除重复字符。
import java.util.HashSet;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Character> has = new HashSet<>();//因为是要接收进每个字符，所以此处泛型用char的Character自动装箱，毕竟《》里面需要放引用类型
        System.out.println("请输入字符：");
        String c = sc.nextLine();//输入字符
        char[] arr = c.toCharArray();//将字符串转换为字符数组，以便遍历

        for (Character character : arr) {//获取每个字符添加进集合
            has.add(character);
        }
        //遍历
        for (char d : has) {
            System.out.print(d);

        }
    }

}
