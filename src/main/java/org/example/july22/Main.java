package org.example.july22;

import java.util.List;

public class Main {
    public static final Student STUDENT= new Student("王五","一班",123456789);
    public static void main(String[] args){
        Student stu=new Student("王五");
        System.out.println("");
        System.out.println(Student.school);
        STUDENT.stuId=111L;
        Action actionAdmin=new Admin();
        actionAdmin.method1();
        Action actionStu=new Student();
        actionStu.method1();

        People people=new Student();

    }
}
