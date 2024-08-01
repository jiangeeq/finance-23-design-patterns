package org.example.b19_strategy.risk_strategy_by_reflect;

import java.math.BigDecimal;

public class RiskAssessmentContext {
    private RiskAssessmentStrategy strategy;

    public void setStrategy(Class<?> clazz) {
        try {
            this.strategy = (RiskAssessmentStrategy) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BigDecimal executeStrategy(BigDecimal assetValue) {
        return strategy.assessRisk(assetValue);
    }

    public BigDecimal executeStrategy(Class<?> clazz, BigDecimal assetValue) {
        setStrategy(clazz);
        return executeStrategy(assetValue);
    }
}

