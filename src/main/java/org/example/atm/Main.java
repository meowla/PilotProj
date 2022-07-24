package org.example.atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        printWelcome();
        printMainMenu();
    }
    public static void printWelcome(){
        System.out.println("=== Welcome to the ATM System ===");
    }
    public static void printMainMenu(){
        System.out.println("=== 主菜单 ===");
        System.out.println("1.开设账户");
        System.out.println("2.登录账户");
        System.out.println("3.退出");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();

        switch(choice){
            case 1:
                System.out.println("=== 开设账户 ===");
                System.out.println("请输入 姓名:");
                String userName=in.next();
                System.out.println("请输入 密码:");
                String password=in.next();
                System.out.println("请输入 确认密码:");
                String checkPassword=in.next();
                Account result = AccountManager.openAccount(userName,password,checkPassword);
                if(result!=null){
                    System.out.println("开户成功！！");
                    System.out.println("您的账户信息如下:");
                    System.out.println(result.toString());
                }else{
                    System.out.println("开户失败");
                }
                printMainMenu();
                break;
            case 2:
                System.out.println("=== 登录账户 ===");
                System.out.println("请输入 账号:");
                String accountId=in.next();
                System.out.println("请输入 密码：");
                String pwd=in.next();
                //TODO 开设账户逻辑
                //loginAccount(accountId.pwd);
                boolean isLogin=AccountManager.loginAccount(accountId,pwd);
                if(isLogin) {
                    System.out.println("登录成功！！");
                    printUserMenu();
                }else{
                    System.out.println("登录失败");
                }
                break;
            case 3:
                System.out.println("=== 退出 ===");
                break;
            default:
                System.out.println("输入错误");
                printMainMenu();
                break;

        }
        printMainMenu();
    }
    private static void printUserMenu(){
        System.out.println("=== 用户界面 ===");
        System.out.println("1.提现");
        System.out.println("2.存入");
        System.out.println("3.转账");
        System.out.println("4.查询余额");
        System.out.println("5.查询存取款记录");
        System.out.println("6.查询转账记录");
        System.out.println("7.退出");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        double amount=0;
        double balance=0;
        switch(choice){
            case 1:
                System.out.println("=== 提现 ===");
                System.out.println("请输入 提现金额：");
                amount=in.nextDouble();
                balance=AccountManager.withdraw(amount);
                System.out.println("取现成功，金额为:"+amount+"余额为:"+balance);
                printUserMenu();
                break;
            case 2:
                System.out.println("=== 存入 ===");
                System.out.println("请输入 存入金额：");
                amount=in.nextDouble();
                balance=AccountManager.deposit(amount);
                System.out.println("存入成功，金额为:"+amount+"余额为:"+balance);
                printUserMenu();
                break;
            case 3:
                System.out.println("=== 转账 ===");
                System.out.println("请输入 转账账号: ");
                String toAccountId = in.next();
                System.out.println("请输入 转账用户名: ");
                String toUserName = in.next();
                System.out.println("请输入 转账金额: ");
                amount = in.nextDouble();
                boolean result = AccountManager.transfer(toAccountId, toUserName, amount);
                if (result){
                    System.out.println("转账成功!!!");
                }else{
                    System.out.println("转账失败!!!");
                }
                break;
            case 4:
                System.out.println("=== 查询余额 ===");
                balance = AccountManager.getBalance();
                System.out.println("您的余额为: " + balance);
                break;
            case 7:
                System.out.println("=== 退出 ===");
                AccountManager.logout();
                printMainMenu();
                break;
            default:
                System.out.println("無効な入力");
                break;
        }
        printUserMenu();
    }
}
