package org.homework.day1;

public class work5 {
    public static void main(String[] args){
        for(int male=0;male<=20;male++)
            for(int female=0;female<=33;female++)
                if(5*male+3*female<=100 && male+female+3*(100-5*male-3*female)==100)
                    System.out.println(male+" "+female+" "+3*(100-5*male-3*female));
    }
}
