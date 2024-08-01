package org.example.g01_strategy_templateMethod_observer.transaction_process;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;
import org.example.g01_strategy_templateMethod_observer.transaction_process.observer.AccountScoreLogger;
import org.example.g01_strategy_templateMethod_observer.transaction_process.observer.TradeLogger;
import org.example.g01_strategy_templateMethod_observer.transaction_process.strategy.StockTradingStrategy;
import org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces.TradingStrategy;

/**
 * 交易处理系统
 *
 * 使用设计模式：
 *      策略模式：选择不同的交易算法。
 *      模板方法模式：定义交易的基本流程。
 *      观察者模式：通知系统中其他模块交易状态的变化。
 */
public class Main {
    public static void main(String[] args) {
        TradingStrategy stockStrategy = new StockTradingStrategy();
        BaseTradeProcessor processor = new StockTradeProcessor(stockStrategy);
        Trade trade = new Trade("AAPL", 100);

        TradeLogger tradeLogger = new TradeLogger();
        AccountScoreLogger accountScoreLogger = new AccountScoreLogger();
        processor.addObserver(tradeLogger);
        processor.addObserver(accountScoreLogger);

        processor.processTrade(trade);
    }
}
