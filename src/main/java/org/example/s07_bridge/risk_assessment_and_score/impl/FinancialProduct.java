package org.example.s07_bridge.risk_assessment_and_score.impl;

import org.example.s07_bridge.risk_assessment_and_score.abstracts.RiskAssessment;

// 金融产品抽象类
public abstract class FinancialProduct {
    protected RiskAssessment riskAssessment;

    public FinancialProduct(RiskAssessment riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    // 进行风险评估
    public abstract void performRiskAssessment();
}
