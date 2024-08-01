package org.example.b19_strategy.risk_strategy_by_reflect;

import java.math.BigDecimal;

public interface RiskAssessmentStrategy {
    BigDecimal assessRisk(BigDecimal assetValue);
}
