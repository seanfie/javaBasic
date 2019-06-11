package com.neuedu.seven;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        List<Student>  list = new ArrayList<>();

        list.add(new Student("Tom",18,100,"class05"));
        list.add(new Student("Jerry",22,70,"class04"));
        list.add(new Student("Owen",25,90,"class05"));
        list.add(new Student("Jim",30,80,"class05"));
        list.add(new Student("Steve",28,66,"class06"));
        list.add(new Student("Kevin",24,100,"class04"));

        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i).getAge();
        }
        System.out.println("所有学生的平均分是："+sum/list.size());

        int score4=0;
        int score5=0;
        int score6=0;
        int num4=0;
        int num5=0;
        int num6=0;
        for(int j=0;j<list.size();j++)
        {
            Student st=list.get(j);

            if(st.getClassNum()=="class04")
            {
                num4++;
                score4 +=st.getScore();
            }
            else if(st.getClassNum()=="class05")
            {
                num5++;
                score5+=st.getScore();
            }
            else
            {
                num6++;
                score6+=st.getScore();
            }

        }
        System.out.println("class04的平均分数是："+score4/num4);
        System.out.println("class05的平均分数是："+score5/num5);
        System.out.println("class06的平均分数是："+score6/num6);


    }

}

