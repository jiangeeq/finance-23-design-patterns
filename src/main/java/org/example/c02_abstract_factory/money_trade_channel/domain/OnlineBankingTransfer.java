package org.example.c02_abstract_factory.money_trade_channel.domain;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;

public class OnlineBankingTransfer implements Transfer {
    public void process() {
        System.out.println("从 网上银行 转账");
    }
}

