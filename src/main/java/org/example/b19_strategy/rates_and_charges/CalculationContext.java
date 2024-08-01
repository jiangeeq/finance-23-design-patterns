package org.example.b19_strategy.rates_and_charges;

import java.math.BigDecimal;

// 持有策略对象的引用，并通过设置不同的策略对象来执行相应的计算方法。
public class CalculationContext {
    private CalculationStrategy strategy;

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal executeStrategy(BigDecimal amount) {
        return strategy.calculate(amount);
    }
}
