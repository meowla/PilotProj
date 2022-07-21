package org.homework.day1;

public class work12 {
    public static void main(String[] args){
        int[] arr={32,413,5435,-321};
        swapArrayMembers(arr,0,2);
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ]");
    }
    public static void swapArrayMembers(int[] arr,int index1,int index2){
        int c=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=c;
    }
}
