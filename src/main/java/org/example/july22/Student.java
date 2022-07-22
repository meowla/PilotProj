package org.example.july22;

public class Student extends People implements Action{
    @Override
    public void goClassRoomWay() {
        System.out.println("Student goClassRoomWay");
    }

    @Override
    public void method1() {
        System.out.println("Student method1");
    }

    @Override
    public void method2() {
        System.out.println("Student method2");
    }
    public String theClass;
    public long stuId;
    public static String school="SCU";
    public final static String SCHOOL="SCU";
    public static final Student STUDENT= new Student("王五","一班",123456789);
    public Student(){

    }
    public Student(String name){
        this.name=name;
    }
    public Student(String name, String theClass, long stuId){
        this.name=name;
        this.theClass=theClass;
        this.stuId=stuId;
    }

    public void setName(String name){
        this.name=name;
    }

    public static int compareAge(int age1,int age2){
        return -1;
    }
}
