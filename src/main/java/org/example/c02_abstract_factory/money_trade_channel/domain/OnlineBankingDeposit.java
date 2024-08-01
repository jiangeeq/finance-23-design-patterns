package org.example.c02_abstract_factory.money_trade_channel.domain;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;

// 网银渠道的交易处理
public class OnlineBankingDeposit implements Deposit {
    public void process() {
        System.out.println("从 网上银行 存款");
    }
}
