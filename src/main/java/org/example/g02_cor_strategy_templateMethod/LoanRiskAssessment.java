package org.example.g02_cor_strategy_templateMethod;


import org.example.g02_cor_strategy_templateMethod.interfaces.RiskAssessment;
import org.example.g02_cor_strategy_templateMethod.interfaces.RiskStrategy;

public class LoanRiskAssessment extends RiskAssessment {
    private RiskStrategy strategy;

    public LoanRiskAssessment(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    protected void collectData(RiskRequest request) {
        System.out.println("收集贷款风险数据...");
    }

    @Override
    protected void evaluateRisk(RiskRequest request) {
        strategy.evaluateRisk(request);
    }
}
