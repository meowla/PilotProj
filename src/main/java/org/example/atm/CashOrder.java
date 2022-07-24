package org.example.atm;
import java.util.Date;
import java.util.Random;
public class CashOrder {
    private String accountId;
    private double amount;
    private CashEnum type;
    private boolean isSuccess;
    public CashOrder(String accountId,CashEnum type,double amount,boolean isSuccess){
        this.accountId= accountId;
        this.type=type;
        this.amount=amount;
        this.isSuccess=isSuccess;
    }
    private String getRandomOrderId(String prefix){
        Random rd=new Random();
        StringBuilder sb= new StringBuilder(prefix);
        for(int i=0;i<6;i++){
            int num=rd.nextInt(10);
            sb.append(num);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "CashOrder{" +
                "accountId='" + accountId + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", isSuccess=" + isSuccess +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public CashEnum getType() {
        return type;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
    public boolean getIsSuccess() {
        return isSuccess;
    }
}
