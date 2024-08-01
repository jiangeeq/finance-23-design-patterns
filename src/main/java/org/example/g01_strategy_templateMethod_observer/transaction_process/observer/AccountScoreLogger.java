package org.example.g01_strategy_templateMethod_observer.transaction_process.observer;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;
import org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces.TradeObserver;

public class AccountScoreLogger implements TradeObserver {
    public void update(Trade trade) {
        System.out.println("观察到用户积分变动: " + trade);
    }
}