package org.example.b18_mediator.abstracts;

// 资金渠道类， 定义了与中介者通信的抽象类，持有中介者对象的引用。
public abstract class CapitalChannel {
    protected PaymentMediator mediator;

    public CapitalChannel(PaymentMediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(PaymentMediator mediator) {
        this.mediator = mediator;
    }
}
