package org.example.s06_adapter.integrated_payment_gateway.interfaces.impl;

import org.example.s06_adapter.integrated_payment_gateway.interfaces.PaymentProcessor;
import org.example.s06_adapter.integrated_payment_gateway.provider.AliPayApi;

import java.math.BigDecimal;

// AliPay适配器实现统一支付接口
public class AliPayAdapter implements PaymentProcessor {
    private AliPayApi aliPayApi;
    public AliPayAdapter(AliPayApi aliPayApi) {
        this.aliPayApi = aliPayApi;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        aliPayApi.charge(amount);
    }
}
