package org.example.b22_template_method.impl;

import org.example.b22_template_method.PaymentRequest;
import org.example.b22_template_method.abstracts.PaymentProcessor;

public class CreditCardPaymentProcessor extends PaymentProcessor {

    @Override
    protected boolean validateRequest(PaymentRequest request) {
        System.out.println("验证信用卡支付请求...");
        // 信用卡支付请求验证逻辑
        return true;
    }

    @Override
    protected void executePayment(PaymentRequest request) {
        System.out.println("执行信用卡支付...");
        // 执行信用卡支付逻辑
    }
}

