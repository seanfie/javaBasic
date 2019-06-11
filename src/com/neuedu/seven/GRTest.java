package com.neuedu.seven;

import java.util.ArrayList;
import java.util.List;

public class GRTest {
    public static void main(String[] args) {

        List<Worker> list = new ArrayList<Worker>();

        list.add(new Worker("zhang3", 18, 3000));

        list.add(new Worker("li4", 25, 3300));

        list.add(new Worker("wang5", 22, 3200));

        for (Worker temp : list)

            System.out.println(temp);

        System.out.println("================================");

        list.add(1, new Worker("zhao6", 20, 3100));

        for (Worker temp : list)

            System.out.println(temp);

        System.out.println("================================");

        list.remove(3);

        for (Worker temp : list)

            System.out.println(temp);

        System.out.println("================================"); 	}

}
