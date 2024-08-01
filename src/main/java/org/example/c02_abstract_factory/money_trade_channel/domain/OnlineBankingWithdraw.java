package org.example.c02_abstract_factory.money_trade_channel.domain;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

public class OnlineBankingWithdraw implements Withdraw {
    public void process() {
        System.out.println("从 网上银行 提现");
    }
}