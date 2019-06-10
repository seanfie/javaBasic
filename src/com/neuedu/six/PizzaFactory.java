package com.neuedu.six;
import java.util.Scanner;

public class PizzaFactory {

        public static Pizza getPizza(int order){
            Scanner input =new Scanner(System.in);
            Pizza p=null;
            if(order==1){
                System.out.println("请输入培根克数");
                int gramNum=input.nextInt();
                System.out.println("请输入披萨的大小");
                int size=input.nextInt();
                System.out.println("请输入披萨的价格");
                int price=input.nextInt();
                p=new BaconPizza(size,price,"培根披萨",gramNum);
            }
            else if(order==2){
                System.out.println("请输入配料信息");
                String peiliao=input.next();
                System.out.println("请输入披萨的大小");
                int size=input.nextInt();
                System.out.println("请输入披萨的价格");
                int price=input.nextInt();
                p=new SeaPizza(size,price,"海鲜披萨",peiliao);
            }
            return p;
        }
    }


