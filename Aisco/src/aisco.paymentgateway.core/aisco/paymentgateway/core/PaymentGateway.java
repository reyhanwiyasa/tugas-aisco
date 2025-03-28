package aisco.paymentgateway.core;

public interface PaymentGateway {
    void printHeader();
    void validatePaymentDetails();
    long setFee();
}