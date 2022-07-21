package org.homework.day1;

public class work4 {
    public static void main(String[] args){
        int[] numOfRabbits= new int[20];
        numOfRabbits[0]=1;
        numOfRabbits[1]=1;
        for(int i=2;i<20;i++){
            numOfRabbits[i]=numOfRabbits[i-1]+numOfRabbits[i-2];
        }
        System.out.println(numOfRabbits[19]);
    }
}
