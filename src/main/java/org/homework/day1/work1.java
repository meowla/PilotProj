package org.homework.day1;

public class work1 {
    public static void main(String[] args){
        int max=getMax(1,2,3);
        System.out.println(max);
    }
    public static int getMax(int a,int b,int c){
        if(a>b && a>c)  return a;
        else if(b>=c)   return b;
        else return c;
    }
}
