package com.neuedu.five;

import java.util.Scanner;

public class Gongyushu {

     public static void main(String[] args) {
                    int a, b;
                    Scanner s1 = new Scanner(System.in);
                     Scanner s2 = new Scanner(System.in);
                    a = s1.nextInt();
                     b = s2.nextInt();
         Gongyushu cd = new Gongyushu();
                   int m = cd.division(a, b);
                    int n = a * b / m;
                   System.out.println("最大公约数: " + m);
                   System.out.println("最小公倍数: " + n);
              }

             public int division(int x, int y) {
                   int t;
                   if (x < y) {
                         t = x;
                         x = y;
                         y = t;
                        }

                   while (y != 0) {
                            if (x == y)
                                return 1;
                            else {
                                int k = x % y;
                                x = y;
                                y = k;
                               }
                      }
                    return x;
               }
 }

