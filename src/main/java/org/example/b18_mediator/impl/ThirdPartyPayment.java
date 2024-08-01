package org.example.b18_mediator.impl;
import org.example.b18_mediator.abstracts.CapitalChannel;
import org.example.b18_mediator.abstracts.PaymentMediator;

public class ThirdPartyPayment extends CapitalChannel {
    public ThirdPartyPayment(PaymentMediator mediator) {
        super(mediator);
    }

    public void initiatePayment() {
        System.out.println("发起第三方支付...");
        mediator.notify(this, "ThirdPartyPayment");
    }

    public void processPayment() {
        System.out.println("处理第三方支付...");
    }
}