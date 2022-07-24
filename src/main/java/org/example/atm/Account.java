package org.example.atm;

import java.util.Arrays;
import java.util.Date;

public class Account {
    public String accountId;
    public String username;
    public String password;
    public double balance =0;
    public Date createTime = new Date();

    private CashOrder[] cashOrders = new CashOrder[1000];
    private int cashOrderIndex=0;

    private TransferOrder[] transferOrders = new TransferOrder[1000];
    private int transferOrderIndex=0;

    public void addCashOrder(CashOrder cashOrder){
        cashOrders[cashOrderIndex]=cashOrder;
        cashOrderIndex++;
    }
    public CashOrder[] getCashOrders(){
        return cashOrders;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", createTime=" + createTime +
                '}';
    }
}
