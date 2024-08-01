package org.example.b19_strategy.risk_strategy_by_reflect.impl;

import org.example.b19_strategy.risk_strategy_by_reflect.RiskAssessmentStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 股票风险评估策略
public class StockRiskAssessmentStrategy implements RiskAssessmentStrategy {
    @Override
    public BigDecimal assessRisk(BigDecimal assetValue) {
        // 简化起见，假设股票的风险评估是资产价值的10%
        return assetValue.multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.HALF_UP);
    }
}
