package aisco.paymentgateway.core;

import java.util.ArrayList;
import java.util.List;

public class PaymentGatewayImpl implements PaymentGateway {
    protected String id;
    protected String dateStamp;
    protected String paymentStatus;
    protected long amount;
    protected List<String> transactionList = new ArrayList<>();

    public PaymentGatewayImpl() {
    }
    
    public PaymentGatewayImpl(String id, String dateStamp, String paymentStatus, long amount) {
        this.id = id;
        this.dateStamp = dateStamp;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }

    @Override
    public void printHeader() {
        System.out.println("PAYMENT GATEWAY");
    }

    @Override
    public void validatePaymentDetails() {
        System.out.println("Validating");
    }

    @Override
    public long setFee() {
        return 0;
    }

    @Override
    public void addTransaction() {
        System.out.println("Transaction added");
    }

    @Override
    public void getTransaction() {
        if (transactionList.isEmpty()) {
            System.out.println("No transactions");
        } else {
            for (String transaction : transactionList) {
                System.out.println(transaction);
            }
        }
    }

    // Getters and setters for encapsulation
    public String getId() { return id; }
    public String getDateStamp() { return dateStamp; }
    public String getPaymentStatus() { return paymentStatus; }
    public long getAmount() { return amount; }
    
    public void setId(String id) { this.id = id; }
    public void setDateStamp(String dateStamp) { this.dateStamp = dateStamp; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
    public void setAmount(long amount) { this.amount = amount; }
}
