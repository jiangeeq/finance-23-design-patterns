package org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;

// 策略模式
public interface TradingStrategy {
    void executeTrade(Trade trade);
}
