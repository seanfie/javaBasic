package com.neuedu.test;

public class Instrument {
    private String name;

    public void play(){
        System.out.println("正在用"+name+"演奏");
    }

}
//public class Wind extends Instrument {
//
//    @Override
//    public void play() {
//        System.out.println("正在用Wind演奏");
//    }
//}
//public class Brass extends Instrument {
//
//    @Override
//    public void play() {
//        System.out.println("正在用Brass演奏");
//    }
//}
//public class InstrumentTest {
//
//    public static void main(String[] args) {
//        Wind wind=new Wind();
//        wind.play();
//
//        System.out.println();
//
//        Brass brass=new Brass();
//        brass.play();
//    }
//}


