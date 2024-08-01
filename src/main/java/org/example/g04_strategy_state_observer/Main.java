package org.example.g04_strategy_state_observer;

import org.example.g04_strategy_state_observer.interfaces.InvestmentStrategy;
import org.example.g04_strategy_state_observer.state.ClosedState;
import org.example.g04_strategy_state_observer.state.FrozenState;
import org.example.g04_strategy_state_observer.strategy.StockInvestmentStrategy;

/**
 *  资产管理系统
 *
 * 使用设计模式：
 *      策略模式：选择不同的投资策略。
 *      状态模式：管理资产在不同状态下的行为。
 *      观察者模式：通知投资者资产状态的变化。
 */
public class Main {
    public static void main(String[] args) {
        Asset asset = new Asset("黄金");
        asset.addObserver(new InvestorNotifier());
        asset.handle();

        asset.setState(new FrozenState());
        asset.handle();

        asset.setState(new ClosedState());
        asset.handle();

        InvestmentStrategy stockStrategy = new StockInvestmentStrategy();
        stockStrategy.invest(asset);
    }
}
