package com.neuedu.manager;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

           Impl1 data=new Impl1();
            String nextor;

            System.out.println("-----------------欢迎使用学生管理系统-------------------");
            do { 			Scanner sc=new Scanner(System.in);
               System.out.println("1.添加2.查找3.删除4.修改5.显示");

               int i;
               i=sc.nextInt();
                switch(i) {


                  case 1:   //添加的流程
//                 	           Student s=new Student();
                        System.out.println("请输入学生学号");
                        String id=sc.next();

                        System.out.println("请输入学生年龄");
                        int age=sc.nextInt();

                        System.out.println("请输入学生姓名");
                        String name=sc.next();

                        System.out.println("请输入学生班级");
                        String grade=sc.next();

                        Student student=new Student();
                        student.setAge(age);
                        student.setName(name);
                        student.setNum(id);
                        student.setGrade(grade);
//                 		       data.addStudent(s)

    boolean result=data.addStudent(student);
       if(result) {
             System.out.println("添加成功");
             data.showAll();
         }else {
            System.out.println("添加失败");
             }			break;

                   case 2://查找的流程
                System.out.println("请输入要查找的学生学号");
                  id=sc.next();
                  Student existStudent=data.findStudent(id);
                     if(existStudent!=null) {
                         System.out.println("查找到学生信息如下");
                         System.out.println("学号："+existStudent.getNum()+
                                "；姓名："+existStudent.getName()+
                                "；年龄："+existStudent.getAge()+
                                "；班级："+existStudent.getGrade());
                   }else {
                        System.out.println("未查找到相关信息");
                 }		break;

                     case 3: //删除的流程
                        System.out.println("请输入要删除的学生学号");
                         id=sc.next();
                         result=data.deleteStudent(id);
                       if(result) {
                          System.out.println("删除成功");
                          data.showAll();
                       }else {
                          System.out.println("删除失败");
                           }			break;

                       case 4://修改的流程
                        System.out.println("请输入要更新的学生学号");
                        id=sc.next();
                      existStudent=data.findStudent(id);
                         if(existStudent!=null) {
                                  System.out.println("请输入要更新的学生姓名");
                                 existStudent.setName(sc.next());
                                 System.out.println("请输入要更新的学生年龄");
                                 existStudent.setAge(sc.nextInt());
                                 System.out.println("请输入要更新的学生班级");
                                 existStudent.setGrade(sc.next());
                                 System.out.println("更新成功");
                        }else {
                                 System.out.println("更新失败");
                        }			break;

                         case 5://显示的流程
                               data.showAll();
                                break;
                             }
                    System.out.println("是否继续Y/N");
                     nextor=sc.next();
             }

             while(nextor.equalsIgnoreCase("Y"));
    }
}
