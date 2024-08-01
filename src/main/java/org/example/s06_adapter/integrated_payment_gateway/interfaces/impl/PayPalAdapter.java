package org.example.s06_adapter.integrated_payment_gateway.interfaces.impl;

import org.example.s06_adapter.integrated_payment_gateway.interfaces.PaymentProcessor;
import org.example.s06_adapter.integrated_payment_gateway.provider.PayPalApi;

import java.math.BigDecimal;

// PayPal适配器实现统一支付接口
public class PayPalAdapter implements PaymentProcessor {
    private PayPalApi payPalApi;

    public PayPalAdapter(PayPalApi payPalApi) {
        this.payPalApi = payPalApi;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        payPalApi.makePayment(amount);
    }
}
