package org.example.c02_abstract_factory.product_by_payment.domain;

import org.example.c02_abstract_factory.product_by_payment.interfaces.Payment;

public class DebitCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("借记卡支付方式");
    }
}
