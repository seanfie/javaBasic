package com.neuedu.eight;

import java.util.ArrayList;

//定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class ListTest {

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(6);
            arrayList.add(4);
            arrayList.add(9);

            System.out.println("索引值为:"+listTest(arrayList,10));
        }
        public static int  listTest(ArrayList<Integer> al, Integer s){

            for (int i = 0; i < al.size(); i++) {
                if (al.get(i)==s)
                    return i;
            }
            return -1;
        }
    }

