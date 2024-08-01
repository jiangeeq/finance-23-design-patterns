package org.example.b19_strategy.rates_and_charges.impl;

import org.example.b19_strategy.rates_and_charges.CalculationStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
// 根据基础利率和加成计算贷款利息
public class VariableRateStrategy implements CalculationStrategy {
    private BigDecimal baseRate;
    private BigDecimal margin;

    public VariableRateStrategy(BigDecimal baseRate, BigDecimal margin) {
        this.baseRate = baseRate;
        this.margin = margin;
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        BigDecimal annualRate = baseRate.add(margin);
        // 简化起见，假设利率是年利率，并且只计算一年的利息
        return amount.multiply(annualRate).setScale(2, RoundingMode.HALF_UP);
    }
}