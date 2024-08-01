package org.example.b18_mediator.impl;
import org.example.b18_mediator.abstracts.CapitalChannel;
import org.example.b18_mediator.abstracts.PaymentMediator;

public class CreditCardPayment extends CapitalChannel {
    public CreditCardPayment(PaymentMediator mediator) {
        super(mediator);
    }

    public void initiatePayment() {
        System.out.println("发起信用卡支付...");
        mediator.notify(this, "CreditCardPayment");
    }

    public void processPayment() {
        System.out.println("处理信用卡支付...");
    }
}