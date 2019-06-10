package com.neuedu.six;

/**
 * 1.编写程序实现比萨制作。
 * 需求说明编写程序，接收用户输入的信息，选择需要制作的比萨。
 * 可供选择的比萨有：培根比萨和海鲜比萨。
 * 实现思路及关键代码
 * 1)?分析培根比萨和海鲜比萨
 * 2)?定义比萨类
 * 3)?属性：名称、价格、大小
 * 4)?方法：展示
 * 5)?定义培根比萨和海鲜比萨继承自比萨类
 * 6)?定义比萨工厂类，根据输入信息产生具体的比萨对象
 * */
public class Pizza {
    private  int size;
    private double price;
    private  String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Pizza(){
        super();
    }
    public Pizza(int size,int price,String name){
        super();;
        this.size=size;
        this.price=price;
        this.name=name;
    }
    public String show(){
        return "这是制作披萨的方法";
    }

}

