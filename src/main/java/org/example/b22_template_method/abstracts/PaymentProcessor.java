package org.example.b22_template_method.abstracts;

import org.example.b22_template_method.PaymentRequest;

public abstract class PaymentProcessor {
    // 模板方法
    public final void processPayment(PaymentRequest request) {
        if (validateRequest(request)) {
            executePayment(request);
            recordTransaction(request);
            notifyMerchant(request);
        } else {
            System.out.println("支付请求验证失败。");
        }
    }

    // 基本步骤（抽象方法）
    protected abstract boolean validateRequest(PaymentRequest request);
    protected abstract void executePayment(PaymentRequest request);

    // 基本步骤（具体实现）
    private void recordTransaction(PaymentRequest request) {
        System.out.println("记录交易 " + request.getAmount() + " " + request.getCurrency());
        // 记录交易的逻辑
    }

    private void notifyMerchant(PaymentRequest request) {
        System.out.println("通知商户进行交易 " + request.getTransactionId());
        // 通知商户的逻辑
    }
}
