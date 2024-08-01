package org.example.b18_mediator.abstracts;

// 中介者接口
public interface PaymentMediator {
    // 定义了 notify 方法，用于渠道之间的通信。
    void notify(CapitalChannel sender, String event);
}
