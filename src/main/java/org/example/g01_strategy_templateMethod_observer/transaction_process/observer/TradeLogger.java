package org.example.g01_strategy_templateMethod_observer.transaction_process.observer;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;
import org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces.TradeObserver;

public class TradeLogger implements TradeObserver {
    public void update(Trade trade) {
        System.out.println("观察到交易: " + trade);
    }
}