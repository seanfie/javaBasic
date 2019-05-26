package com.neuedu.test;
/**
 * 4.有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
 * */
public class WorkTwo_04 {
    public static void  main(String[] args){
        int[] arr = {1,2,3,4};
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                for(int k=0;k<arr.length;k++) {
                    if(i!=j   &&  j!=k   &&  k!=i) {
                        System.out.println(i*100+j*10+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("一共有"+count+"个无重复数");
    }

}
