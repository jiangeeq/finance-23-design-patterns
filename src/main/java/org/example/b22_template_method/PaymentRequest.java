package org.example.b22_template_method;

public class PaymentRequest {
    private String transactionId;
    private double amount;
    private String currency;
    private String paymentMethod;

    public PaymentRequest(String transactionId, double amount, String currency, String paymentMethod) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}

