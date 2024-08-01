package org.example.b19_strategy.rates_and_charges;

import java.math.BigDecimal;

// 通用的策略接口 用于费用和贷款利率的计算。
public interface CalculationStrategy {
    BigDecimal calculate(BigDecimal amount);
}
