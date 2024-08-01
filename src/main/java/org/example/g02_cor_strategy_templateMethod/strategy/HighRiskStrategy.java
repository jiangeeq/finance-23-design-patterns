package org.example.g02_cor_strategy_templateMethod.strategy;

import org.example.g02_cor_strategy_templateMethod.RiskRequest;
import org.example.g02_cor_strategy_templateMethod.interfaces.RiskStrategy;

public class HighRiskStrategy implements RiskStrategy {
    public void evaluateRisk(RiskRequest request) {
        System.out.println("评估高风险...");
    }
}