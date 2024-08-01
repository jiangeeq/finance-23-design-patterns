package org.example.b19_strategy.risk_strategy_by_reflect.impl;

import org.example.b19_strategy.risk_strategy_by_reflect.RiskAssessmentStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 债券风险评估策略
public class BondRiskAssessmentStrategy implements RiskAssessmentStrategy {
    @Override
    public BigDecimal assessRisk(BigDecimal assetValue) {
        // 简化起见，假设债券的风险评估是资产价值的5%
        return assetValue.multiply(new BigDecimal("0.05")).setScale(2, RoundingMode.HALF_UP);
    }
}

