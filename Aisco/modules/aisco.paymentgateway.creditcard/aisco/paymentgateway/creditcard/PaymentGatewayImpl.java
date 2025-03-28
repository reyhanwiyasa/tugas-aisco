package aisco.paymentgateway.creditcard;

import aisco.paymentgateway.core.PaymentGatewayImpl;

public class PaymentGatewayImpl extends PaymentGatewayImpl {
    protected long cardNumber;

    public PaymentGatewayImpl(String id, String dateStamp, String paymentStatus, long amount, long cardNumber) {
        super(id, dateStamp, paymentStatus, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void printHeader() {
        System.out.println("Payment with Credit Card");
    }

    @Override
    public void validatePaymentDetails() {
        String cardStr = String.valueOf(cardNumber);
        if (cardStr.length() == 10) {
            System.out.println(String.format("%s", "Payment details valid."));
            setPaymentStatus("SUCCESS");
        } else {
            System.out.println(String.format("%s", "Account Number must be exactly 10 digits"));
            setPaymentStatus("FAILED");
        }
    }

    @Override
    public long setFee() {
        long fee = (long) (getAmount() + 2500);
        return fee;
    }
    
    // Additional method for refund logic
    public void refund() {
        System.out.println(String.format("Refund Information");
        if ("SUCCESS".equalsIgnoreCase(getPaymentStatus())) {
            System.out.println(String.format("%s", "Refund is allowed"));
        } else {
            System.out.println(String.format("%s", "Refund is not allowed"));
        }
    }

    @Override
    public void addTransaction() {
        String transactionInfo = String.format(
            "Transaction ID: %s | Date: %s | Payment Status: %s | Payment Method: %s | Card Number: %d | Amount: %d | Fee: %d",
            getId(),
            getDateStamp(),
            getPaymentStatus(),
            "Credit Card",
            cardNumber,
            getAmount(),
            setFee()
        );
        transactionList.add(transactionInfo);
        System.out.println(String.format("\n%s", "Transaction added successfully."));
    }

    @Override
    public void getTransaction() {
        for (String transaction : transactionList) {
           System.out.println(transaction);
            }
        refund();
    }
}
