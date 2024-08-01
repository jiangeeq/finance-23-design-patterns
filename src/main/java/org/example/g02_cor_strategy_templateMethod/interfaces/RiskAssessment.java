package org.example.g02_cor_strategy_templateMethod.interfaces;

import org.example.g02_cor_strategy_templateMethod.RiskRequest;

// 模板方法模式
public abstract class RiskAssessment {
    public final void assessRisk(RiskRequest request) {
        collectData(request);
        evaluateRisk(request);
        reportResults(request);
    }

    protected abstract void collectData(RiskRequest request);
    protected abstract void evaluateRisk(RiskRequest request);

    private void reportResults(RiskRequest request) {
        System.out.println("报告风险评估结果...");
    }
}
