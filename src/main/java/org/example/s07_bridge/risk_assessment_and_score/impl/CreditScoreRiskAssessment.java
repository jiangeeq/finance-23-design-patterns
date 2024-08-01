package org.example.s07_bridge.risk_assessment_and_score.impl;

import org.example.s07_bridge.risk_assessment_and_score.abstracts.RiskAssessment;

// 基于信用评分的评估算法
public class CreditScoreRiskAssessment implements RiskAssessment {
    @Override
    public int assessRisk() {
        int score = 98;
        System.out.println("通过历史交易数据分析到贷款机构信用评分："+score);
        return score;
    }
}
