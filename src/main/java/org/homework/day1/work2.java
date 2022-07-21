package org.homework.day1;
public class work2 {
    public static void main(String[] args){
        double num=abs(-10);
        System.out.println(num);
    }
    public static double abs(int a){
        return a>0? a: -a;
    }
}