package org.example.b18_mediator.impl;
import org.example.b18_mediator.abstracts.CapitalChannel;
import org.example.b18_mediator.abstracts.PaymentMediator;

//具体渠道类
public class BankTransferPayment extends CapitalChannel {
    public BankTransferPayment(PaymentMediator mediator) {
        super(mediator);
    }

    public void initiatePayment() {
        System.out.println("发起银行转账...");
        mediator.notify(this, "BankTransfer");
    }

    public void processPayment() {
        System.out.println("处理银行转帐付款...");
    }
}