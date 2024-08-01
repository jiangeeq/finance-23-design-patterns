package org.example.c02_abstract_factory.money_trade_channel.domain;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

public class MobileBankingWithdraw implements Withdraw {
    @Override
    public void process() {
        System.out.println("从 手机银行 提现");

    }
}
