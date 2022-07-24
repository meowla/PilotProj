package org.example.atm;

import java.util.Random;

public class AccountManager {
    public static Account[] accounts=new Account[100];

    public static int currentAccountIndex=0;
    public static Account currentAccount=null;
    public static Account openAccount(String username, String password, String checkPassword){
        //TODO 开户逻辑
        if(!password.equals(checkPassword)){
            System.out.println("内部报错：入力された2つのパスワードが一致しない。");
            return null;
        }
        Account account= new Account();
        account.username=username;
        account.password=password;
        account.accountId=getRandomAccountId();
        accounts[currentAccountIndex++]=account;
        if(currentAccountIndex==accounts.length)
            reSize();
        return account;
    }
    private static void reSize(){
        Account[] newAccounts=new Account[accounts.length*2];
        for(int i=0;i<accounts.length;i++){
            newAccounts[i]=accounts[i];
        }
        accounts=newAccounts;
    }
    public static boolean loginAccount(String accountId,String password){
        // TODO 登录逻辑
        for(int i=0;i<currentAccountIndex;i++){
            Account account=accounts[i];
            if(account == null)
                continue;
            if(account.accountId.equals(accountId) && account.password.equals(password)){
                currentAccount=account;
                return true;
            }
        }
        return false;
    }
    //登陆后调用
    public static double withdraw(double amount){
        //TODO 提现逻辑
        if(currentAccount == null){
            System.out.println("内部报错：请先登录");
            Main.printMainMenu();
            return -1;
        }
        if(amount <=0){
            System.out.println("内部报错：提现金额不合理");
            return -1;
        }
        if(amount >=currentAccount.balance){
            System.out.println("内部报错：余额不足");
            return -1;
        }
        currentAccount.balance -= amount;
        CashOrder cashOrder=new CashOrder(currentAccount.accountId, CashEnum.WITHDRAW,amount,true);
        currentAccount.addCashOrder(cashOrder);
        return currentAccount.balance;
    }
    public static double deposit(double amount){
        if(currentAccount==null){
            System.out.println("内部报错：请先登录");
            Main.printMainMenu();
            return -1;
        }
        if(amount<=0){
            System.out.println("内部报错：存入金额不合理");
            return -1;
        }
        currentAccount.balance+=amount;
        CashOrder cashOrder=new CashOrder(currentAccount.accountId, CashEnum.DEPOSIT,amount,true);
        currentAccount.addCashOrder(cashOrder);
        return currentAccount.balance;
    }
    public static double getBalance(){
        if(currentAccount==null){
            System.out.println("内部报错：请先登录");
            Main.printMainMenu();
            return -1;
        }
        //TODO 获取余额逻辑
        return 0;
    }
    public static boolean transfer(String toAccountId,String toUsername, double amount){
        if(currentAccount == null){
            System.out.println("内部报错：请先登录");
            Main.printMainMenu();
            return false;
        }
        Account toAccount=getAccountByIdAndUsername(toAccountId,toUsername);
        if(toAccountId.equals(currentAccount.accountId)){
            System.out.println("内部报错：無効な送金先");
            return false;
        }
        if(amount>= currentAccount.balance){
            System.out.println("内部报错：余额不足(バランス不足)");
            return false;
        }
        currentAccount.balance-=amount;
        toAccount.balance+=amount;
        return true;
    }
    public static Account getAccountByIdAndUsername(String accountId,String username){
        for(int i=0;i<currentAccountIndex;i++){
            Account account= accounts[i];
            if(account==null)
                continue;
            if(account.accountId.equals(accountId) && account.username.equals(username))
                return account;
        }
        return null;
    }
    private static String getRandomAccountId(){
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<6;i++){
            int num=random.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }
    public static void logout(){
        currentAccount=null;
    }

}
