package org.example.c02_abstract_factory.money_trade_channel.domain;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;

public class ATMDeposit implements Deposit {
    @Override
    public void process() {
        System.out.println("从 ATM 存款");
    }
}
