package org.example.july22;

public class Teacher extends People implements Action{


    @Override
    public void goClassRoomWay() {
        System.out.println("Teacher goClassRoomWay");
    }

    @Override
    public void method1() {
        System.out.println("Teacher method1");
    }

    @Override
    public void method2() {
        System.out.println("Teacher method2");
    }
}

