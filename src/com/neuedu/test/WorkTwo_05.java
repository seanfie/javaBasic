package com.neuedu.test;
/**
 * 5.分别计算1-100之间的奇数和 和 偶数和
 * */
public class WorkTwo_05 {
    public static void main(String[] args) {
        int a=0;
        for (int odd= 1; odd <= 100; odd += 3) {
         a+=odd;
        }
        int b = 0;
        for (int even = 1; even <= 100; even+= 2) {
            b += even;
        }
        System.out.println("1到100的奇数和为：" + a);
        System.out.println("1到100的偶数和为：" + b);

    }
}
