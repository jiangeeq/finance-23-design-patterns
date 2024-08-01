package org.example.b19_strategy.rates_and_charges.impl;

import org.example.b19_strategy.rates_and_charges.CalculationStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 固定收费策略
public class FixedFeeStrategy implements CalculationStrategy {
    private BigDecimal fixedFee;

    public FixedFeeStrategy(BigDecimal fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        return amount.multiply(fixedFee).setScale(2, RoundingMode.HALF_UP);
    }
}