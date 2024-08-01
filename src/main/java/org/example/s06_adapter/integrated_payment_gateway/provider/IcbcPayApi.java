package org.example.s06_adapter.integrated_payment_gateway.provider;

import java.math.BigDecimal;

// 第三方工商银行支付网关API
public class IcbcPayApi {
    public void processMoney(BigDecimal amount) {
        System.out.println("通过工商银行处理付款: " + amount);
    }
}
