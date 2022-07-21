package org.homework.day1;

public class work13 {
    public static void main(String[] arr){
        isIdentical((byte)1,(byte)1);
        isIdentical((short)1,(short)1);
        isIdentical(1,1);
        isIdentical(1L,1L);
    }
    public static boolean isIdentical(byte a,byte b){
        System.out.println("Methodenreferenz ist ein byte.");
        return a==b;
    }
    public static boolean isIdentical(short a,short b){
        System.out.println("Methodenreferenz ist ein short.");
        return a==b;
    }
    public static boolean isIdentical(int a,int b){
        System.out.println("Methodenreferenz ist ein int.");
        return a==b;
    }
    public static boolean isIdentical(long a,long b){
        System.out.println("Methodenreferenz ist ein long.");
        return a==b;
    }
}
