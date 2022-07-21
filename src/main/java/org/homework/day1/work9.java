package org.homework.day1;

public class work9 {
    public static void main(String[] args){
        int[] arr={ 19, 28, 37, 46, 50 };
        int[] revArr=reverseArray(arr);
        for(int i=0;i<revArr.length;i++)
            System.out.println(revArr[i]);
    }
    public static int[] reverseArray(int[] a){
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++)
            b[i]=a[a.length-1-i];
        return b;
    }
}
