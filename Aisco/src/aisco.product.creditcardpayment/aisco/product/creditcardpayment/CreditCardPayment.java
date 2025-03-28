package aisco.product.creditcardpayment;

import aisco.program.ProgramFactory;
import aisco.program.core.Program;
import aisco.financialreport.FinancialReportFactory;
import aisco.financialreport.core.FinancialReport;
import aisco.donation.DonationFactory;
import aisco.donation.core.Donation;
import aisco.paymentgateway.PaymentGatewayFactory;
import aisco.paymentgateway.core.PaymentGateway;

public class CreditCardPayment {
	private static Program activityProgram;
	private static Program operationalProgram;
	private static FinancialReport financialreportFinancialReport;
	private static FinancialReport incomeFinancialReport;
	private static FinancialReport expenseFinancialReport;
	private static Donation donationDonation;
	private static Donation donationDonation;
	private static Donation pgatewayDonation;
	private static PaymentGateway paymentgatewayPaymentGateway;
	private static PaymentGateway creditcardPaymentGateway;

    public static void main(String[] args) {    	
        System.out.println("Product Charity with Credit Card Payment)");

        // Create a PaymentGateway Credit Card instance.
        // Parameters: id, dateStamp, initial paymentStatus, amount, cardNumber.
        // Using a valid 10-digit card number (e.g., 1234567890) for success.
        PaymentGatewayImpl creditCardGateway = new PaymentGatewayImpl("001", "28-03-2025", "INIT", 100000, 1234567890L);
        
        // Print header specific to Credit/Debit Card processing.
        creditCardGateway.printHeader();
        
        // Validate payment details; if the card number has exactly 10 digits,
        // it will print that payment details are valid and update the status to "SUCCESS".
        creditCardGateway.validatePaymentDetails();
        
        // Add a transaction (which will use custom fee calculation and include card details).
        creditCardGateway.addTransaction();
        
        // Retrieve and print the transaction information, then display refund info.
        creditCardGateway.getTransaction();
    }
}
