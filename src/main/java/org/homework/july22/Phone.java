package org.homework.july22;

public class Phone {
    public String brand;
    public int price;
    public String color;
    public void call(){
        System.out.println("用"+this.brand+"牌"+this.price+"元的"+this.color+"色手机打电话。");
    }
    public void sendMessage(){
        System.out.println("用"+this.brand+"牌"+this.price+"元的"+this.color+"色手机发短信。");
    }
}
