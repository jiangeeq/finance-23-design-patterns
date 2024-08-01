package org.example.c02_abstract_factory.product_by_payment.domain;

import org.example.c02_abstract_factory.product_by_payment.interfaces.Payment;

// 实现具体的支付方式
public class CreditCardPayment  implements Payment {
    public void processPayment() {
        System.out.println("信用卡支付方式");
    }
}