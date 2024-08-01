package org.example.g04_strategy_state_observer.strategy;

import org.example.g04_strategy_state_observer.Asset;
import org.example.g04_strategy_state_observer.interfaces.InvestmentStrategy;

public class BondInvestmentStrategy implements InvestmentStrategy {
    public void invest(Asset asset) {
        System.out.println("投资债券: " + asset.getName());
    }
}
