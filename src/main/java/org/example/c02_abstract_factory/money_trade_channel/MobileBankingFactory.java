package org.example.c02_abstract_factory.money_trade_channel;

import org.example.c02_abstract_factory.money_trade_channel.domain.MobileBankingDeposit;
import org.example.c02_abstract_factory.money_trade_channel.domain.MobileBankingTransfer;
import org.example.c02_abstract_factory.money_trade_channel.domain.MobileBankingWithdraw;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

// 手机银行工厂
public class MobileBankingFactory implements TransactionFactory {
    public Deposit createDeposit() {
        return new MobileBankingDeposit();
    }

    public Withdraw createWithdraw() {
        return new MobileBankingWithdraw();
    }

    public Transfer createTransfer() {
        return new MobileBankingTransfer();
    }
}
