package org.homework.day1;

public class work3 {
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            System.out.println(String.valueOf(i) + ((i%7==0)?"过":""));
        }
    }
}
