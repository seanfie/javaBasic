package com.neuedu.seven;
//1) 创建一个List，在List 中增加三个工人，基本信息如下：
//        姓名 年龄 工资
//        zhang3 18 3000
//        li4 25 3500
//        wang5 22 3200
//        2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
//        3) 删除wang5 的信息
//        4) 利用for 循环遍历，打印List 中所有工人的信息
//        5) 利用迭代遍历，对List 中所有的工人调用work 方法。

 public class Worker {
    private String name;
    private int age;
    private int salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;	}
        public void setSalary(int salary) {
        this.salary = salary;
    }
    public Worker() {
        super();
 }
         public Worker(String name, int age, int salary) {
         		super();
         	this.name = name;
         		this.age = age;
         		this.salary = salary;
         }
         	@Override
        public String toString(){
         		return "Worker [name=" + name + ", age=" + age + ", salary=" +salary+ "]";
         	}
         }

