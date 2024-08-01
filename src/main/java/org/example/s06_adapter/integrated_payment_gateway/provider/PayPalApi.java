package org.example.s06_adapter.integrated_payment_gateway.provider;

import java.math.BigDecimal;

// 第三方PayPal支付网关API
public class PayPalApi {
    public void makePayment(BigDecimal amount) {
        System.out.println("通过PayPal处理付款: " + amount);
    }
}
