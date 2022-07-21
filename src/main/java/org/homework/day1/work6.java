package org.homework.day1;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class work6 {
    public static void main(String[] args){
        int[] arr={68,27,95,88,171,996,51,210};
        int sum=0;
        for(int i=0;i<arr.length;i++)
            if(judge(arr[i]))
                sum+=arr[i];
        System.out.println(sum);
    }
    public static boolean judge(int a){
        if(a%10==7) return false;
        if((a%100)/10==7)   return false;
        if(a%2==1)  return false;
        return true;
    }
}
