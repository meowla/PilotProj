package org.homework.day1;

public class work7 {
    public static void main(String[] args){
        int[] a={1,2,3};
        int[] b=a;
        int[] c={1,2,2};
        int[] d={1,2,3,4};
        System.out.println(areArraysIdentical(a,b));
        System.out.println(areArraysIdentical(a,c));
        System.out.println(areArraysIdentical(a,d));
    }
    public static boolean areArraysIdentical(int[] a,int[] b){
        if(a.length!=b.length)  return false;
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i])  return false;
        return true;
    }
}
