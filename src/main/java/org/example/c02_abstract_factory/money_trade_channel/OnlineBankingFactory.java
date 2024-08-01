package org.example.c02_abstract_factory.money_trade_channel;

import org.example.c02_abstract_factory.money_trade_channel.domain.OnlineBankingDeposit;
import org.example.c02_abstract_factory.money_trade_channel.domain.OnlineBankingTransfer;
import org.example.c02_abstract_factory.money_trade_channel.domain.OnlineBankingWithdraw;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

// 网银工厂
public class OnlineBankingFactory implements TransactionFactory {
    public Deposit createDeposit() {
        return new OnlineBankingDeposit();
    }

    public Withdraw createWithdraw() {
        return new OnlineBankingWithdraw();
    }

    public Transfer createTransfer() {
        return new OnlineBankingTransfer();
    }
}
