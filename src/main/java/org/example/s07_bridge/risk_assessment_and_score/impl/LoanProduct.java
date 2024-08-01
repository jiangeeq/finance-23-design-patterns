package org.example.s07_bridge.risk_assessment_and_score.impl;

import org.example.s07_bridge.risk_assessment_and_score.abstracts.RiskAssessment;

// 贷款产品：银行或其他金融机构提供的各种贷款方案，包括房屋贷款、汽车贷款、个人贷款等。
public class LoanProduct extends FinancialProduct {
    public LoanProduct(RiskAssessment riskAssessment) {
        super(riskAssessment);
    }

    @Override
    public void performRiskAssessment() {
        int score = riskAssessment.assessRisk();
        System.out.println("贷款产品风险指数: " + (score > 60? "优秀":"良好"));
    }
}
