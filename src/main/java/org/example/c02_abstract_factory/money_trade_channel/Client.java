package org.example.c02_abstract_factory.money_trade_channel;

import org.example.c02_abstract_factory.money_trade_channel.interfaces.Deposit;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Transfer;
import org.example.c02_abstract_factory.money_trade_channel.interfaces.Withdraw;

// 金融交易的客户端
public class Client {
    private Deposit deposit;
    private Withdraw withdraw;
    private Transfer transfer;

    public Client(TransactionFactory factory) {
        this.deposit = factory.createDeposit();
        this.withdraw = factory.createWithdraw();
        this.transfer = factory.createTransfer();
    }

    public void processTransactions() {
        deposit.process();
        withdraw.process();
        transfer.process();
    }
}
