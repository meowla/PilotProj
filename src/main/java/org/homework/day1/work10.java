package org.homework.day1;
import java.util.Random;
public class work10 {
    public static void main(String[] args){
        int[] grades=new int[6];
        randomizeArray(grades);
        printArray(grades);
        int ave=getFairAverage(grades);
        System.out.println("The final grade is:");
        System.out.println(ave);
    }
    public static void randomizeArray(int[] a){
        Random rd=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt(101);
        }
    }
    public static int getFairAverage(int[] a){
        //This method is to calculate average of an array without its maximum and minimum
        //This method only applies to an array with 3 members or more.
        int min=100000;
        int max=-100000;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min)    min=a[i];
            if(a[i]>max)    max=a[i];
            sum+=a[i];
        }
        return (sum-min-max)/(a.length-2);
    }
    public static void printArray(int[] arr){
        System.out.println("The original grades are:");
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
