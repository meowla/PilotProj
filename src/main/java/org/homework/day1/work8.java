package org.homework.day1;
import java.util.Scanner;
public class work8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={19,28,37,46,50};
        System.out.println("Bitte geben Sie eine ganze Zahl ein:");
        int a=sc.nextInt();
        System.out.println(getIndex(arr,a));
    }
    public static int getIndex(int[] arr,int a){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==a)    return i;
        return -1;
    }
}
