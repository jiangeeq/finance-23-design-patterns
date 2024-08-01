package org.example.b18_mediator;

import org.example.b18_mediator.abstracts.CapitalChannel;
import org.example.b18_mediator.abstracts.PaymentMediator;
import org.example.b18_mediator.impl.BankTransferPayment;
import org.example.b18_mediator.impl.CreditCardPayment;
import org.example.b18_mediator.impl.ThirdPartyPayment;

// 具体中介者类 负责协调不同支付方式的请求处理。
public class PaymentProcessor implements PaymentMediator {
    private BankTransferPayment bankTransfer;
    private CreditCardPayment creditCardPayment;
    private ThirdPartyPayment thirdPartyPayment;


    public void setBankTransfer(BankTransferPayment bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    public void setThirdPartyPayment(ThirdPartyPayment thirdPartyPayment) {
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void notify(CapitalChannel sender, String event) {
        System.out.println("中介者收到消息："+event);
        if (event.equals("BankTransfer")) {
            bankTransfer.processPayment();
        } else if (event.equals("CreditCardPayment")) {
            creditCardPayment.processPayment();
        } else if (event.equals("ThirdPartyPayment")) {
            thirdPartyPayment.processPayment();
        }
    }
}

