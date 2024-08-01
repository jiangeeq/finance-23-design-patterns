package org.example.c02_abstract_factory.money_trade_channel;

import org.example.c02_abstract_factory.money_trade_channel.domain.ATMDeposit;
import org.example.c02_abstract_factory.money_trade_channel.domain.ATMTransfer;
import org.example.c02_abstract_factory.money_trade_channel.domain.ATMWithdraw;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

// ATM工厂
public class ATMFactory implements TransactionFactory {
    public Deposit createDeposit() {
        return new ATMDeposit();
    }

    public Withdraw createWithdraw() {
        return new ATMWithdraw();
    }

    public Transfer createTransfer() {
        return new ATMTransfer();
    }
}