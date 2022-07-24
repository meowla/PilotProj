package org.example.atm;
import java.util.Date;
public class TransferOrder {
    private String orderId;
    private String fromAccountId;
    private String toAccountId;
    private double amount;
    private boolean isSuccess;
    private Date time=new Date();

    public TransferOrder(String fromAccountId,String toAccountId, double amount){
        this.fromAccountId=fromAccountId;
        this.toAccountId=toAccountId;
        this.amount=amount;
    }

    @Override
    public String toString() {
        return "TransferOrder{" +
                "orderId='" + orderId + '\'' +
                ", fromAccountId='" + fromAccountId + '\'' +
                ", toAccountId='" + toAccountId + '\'' +
                ", amount=" + amount +
                ", isSuccess=" + isSuccess +
                ", time=" + time +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public String getToAccountId() {
        return toAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public boolean getIsSuccess(){
        return isSuccess;
    }

    public Date getTime() {
        return time;
    }
}
