package com.neuedu.test;

public class WorkFour_01 {
    private String number;
    private String name;
    private int Chineae;
    private int English;
    private int Math;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineae() {
        return Chineae;
    }

    public void setChineae(int chineae) {
        Chineae = chineae;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }
    public void mean(){
        int a=(getChineae()+getEnglish()+getMath())/3;
        System.out.println(getName()+"平均数"+a);
    }
}
