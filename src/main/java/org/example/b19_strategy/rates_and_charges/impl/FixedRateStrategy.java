package org.example.b19_strategy.rates_and_charges.impl;

import org.example.b19_strategy.rates_and_charges.CalculationStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 根据固定年利率计算贷款利息
public class FixedRateStrategy implements CalculationStrategy {
    private BigDecimal annualRate;

    public FixedRateStrategy(BigDecimal annualRate) {
        this.annualRate = annualRate;
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        // 简化起见，假设利率是年利率，并且只计算一年的利息
        return amount.multiply(annualRate).setScale(2, RoundingMode.HALF_UP);
    }
}