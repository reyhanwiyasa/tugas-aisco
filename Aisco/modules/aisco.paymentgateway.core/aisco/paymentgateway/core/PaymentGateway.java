package aisco.paymentgateway.core;

public interface PaymentGateway {
    void printHeader();
    void validatePaymentDetails();
    void addTransaction();
    void getTransaction();
    void setFee();
}
