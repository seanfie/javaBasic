package com.neuedu.six;

public class SeaPizza  extends  Pizza {
    static String peiliao;

    public static String getPeiliao() {
        return peiliao;
    }

    public static void setPeiliao(String peiliao) {
        SeaPizza.peiliao = peiliao;
    }

    public SeaPizza() {
        super();
    }

    public SeaPizza(int size, int price, String name, String peiliao) {
        super(size, price, name);
        this.peiliao = peiliao;
    }

    public String show() {
        return "名称：" + super.getName() + "\n价格：" + super.getPrice() + "元\n大小："
                + super.getSize() + "寸" + "\n配料:" + peiliao;
    }
}
