package org.example.s06_adapter.integrated_payment_gateway.interfaces;

import java.math.BigDecimal;

// 定义统一的支付接口
public interface PaymentProcessor {
    void processPayment(BigDecimal amount);
}

