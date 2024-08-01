package org.example.c02_abstract_factory.money_trade_channel.domain;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;

public class MobileBankingTransfer implements Transfer {
    @Override
    public void process() {
        System.out.println("从 手机银行 转账");

    }
}
