package com.neuedu.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Impl1 implements MangerStore {
    //创建一个arraylist集合来存放学生对象
    	private List<Student> StuList=new ArrayList<Student>();

        @Override
        public boolean addStudent(Student student) {

            	return StuList.add(student);
    	}
    	@Override
        public Student findStudent(String studentNo) {
        Iterator<Student> it=StuList.iterator();
        while(it.hasNext()) {
            Student student=it.next();
            if(studentNo.equals(student.getNum())) {
                return student;
            }
        }		return null;	}
        @Override
        public boolean deleteStudent(String studentNo) {

            	Student existStudent=findStudent(studentNo);
            	if(existStudent!=null) {
            	    return StuList.remove(existStudent);
            	}
            	    return false;
    	}
            	    @Override
                    public Student updateStudent(String studentNo,String name,String grade,int age) {

                       Student existStudent=findStudent(studentNo);
                       if(existStudent!=null) {
                           return existStudent;
                       }
                       return null;
    	}
                       @Override
                       public void showAll() {

                           	System.out.println("学号||姓名||班级||年龄");
                           	Iterator<Student> it=StuList.iterator();
                           	while(it.hasNext()) {
                           	    Student st=it.next();
                           	    System.out.println(st.getNum()+"——"+st.getName()+"——"+st.getGrade()+"——"+st.getAge());
                           	}
                           	return;
    	}
}

