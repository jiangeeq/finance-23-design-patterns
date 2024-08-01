package org.example.s06_adapter.integrated_payment_gateway.interfaces.impl;

import org.example.s06_adapter.integrated_payment_gateway.interfaces.PaymentProcessor;
import org.example.s06_adapter.integrated_payment_gateway.provider.IcbcPayApi;

import java.math.BigDecimal;

// ICBC适配器实现统一支付接口
public class IcbcPayAdapter implements PaymentProcessor {
    private IcbcPayApi icbcPayApi;
    public IcbcPayAdapter(IcbcPayApi icbcPayApi) {
        this.icbcPayApi = icbcPayApi;
    }

    @Override
    public void processPayment(BigDecimal amount) {
        icbcPayApi.processMoney(amount);
    }
}
