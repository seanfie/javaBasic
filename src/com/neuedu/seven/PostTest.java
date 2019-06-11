package com.neuedu.seven;
//编写一个程序，使用集合存储客户的邮件地址。
//        地址中应该包含姓名，街道，市（县），省（自治区），国家（地区）然后显示集合ArrayList
//        中的内容

import java.util.ArrayList;
import java.util.List;

public class PostTest {
        public static void main(String[] args) {
            List l=new ArrayList();
            l.add(new Post("张三","桥西","石家庄","河北","中国"));
            l.add(new Post("李四","城关","兰州","甘肃","中国"));
            l.add(new Post("王五","东丽","天津","天津","中国"));

            for(int i=0;i<l.size();i++)
            {
                Post p=(Post)l.get(i);
                System.out.println("姓名："+p.name +"；街道："+ p.street +"；市："+ p.city+"；省："+p.province+"；国家："+p.country);
            }
        }

    }
