package org.example.c02_abstract_factory.money_trade_channel;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

// 定义抽象交易工厂接口
public interface TransactionFactory {
    Deposit createDeposit();
    Withdraw createWithdraw();
    Transfer createTransfer();
}
