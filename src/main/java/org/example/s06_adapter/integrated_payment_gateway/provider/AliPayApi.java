package org.example.s06_adapter.integrated_payment_gateway.provider;

import java.math.BigDecimal;

// 第三方支付宝支付网关API
public class AliPayApi {
    public void charge(BigDecimal amount) {
        System.out.println("通过支付宝处理付款: " + amount);
    }
}
