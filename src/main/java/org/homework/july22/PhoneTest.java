package org.homework.july22;

public class PhoneTest {
    public static void main(String[] args){
        Phone iphone=new Phone();
        iphone.price=12000;
        iphone.color="Pure White";
        iphone.brand="Apple";
        iphone.call();
        iphone.sendMessage();
    }
}
