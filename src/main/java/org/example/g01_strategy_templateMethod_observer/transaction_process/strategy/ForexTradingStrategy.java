package org.example.g01_strategy_templateMethod_observer.transaction_process.strategy;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;
import org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces.TradingStrategy;

public class ForexTradingStrategy  implements TradingStrategy {
    public void executeTrade(Trade trade) {
        System.out.println("执行外汇交易 " + trade.getAmount() + " 单位 " + trade.getSymbol());
    }
}
