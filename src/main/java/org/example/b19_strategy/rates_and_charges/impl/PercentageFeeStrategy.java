package org.example.b19_strategy.rates_and_charges.impl;

import org.example.b19_strategy.rates_and_charges.CalculationStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 百分比收费策略
public class PercentageFeeStrategy implements CalculationStrategy {
    private BigDecimal percentage;

    public PercentageFeeStrategy(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        return amount.multiply(percentage).setScale(2, RoundingMode.HALF_UP);
    }
}