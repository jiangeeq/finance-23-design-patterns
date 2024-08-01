package org.example.b22_template_method.impl;


import org.example.b22_template_method.PaymentRequest;
import org.example.b22_template_method.abstracts.PaymentProcessor;

public class PayPalPaymentProcessor extends PaymentProcessor {

    @Override
    protected boolean validateRequest(PaymentRequest request) {
        System.out.println("验证PayPal支付请求...");
        // PayPal支付请求验证逻辑
        return true;
    }

    @Override
    protected void executePayment(PaymentRequest request) {
        System.out.println("执行PayPal支付\n...");
        // 执行PayPal支付逻辑
    }
}
