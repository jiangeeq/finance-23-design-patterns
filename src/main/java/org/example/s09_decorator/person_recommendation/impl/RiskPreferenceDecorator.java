package org.example.s09_decorator.person_recommendation.impl;

import org.example.s09_decorator.person_recommendation.interfaces.Recommendation;
import org.example.s09_decorator.person_recommendation.interfaces.RecommendationDecorator;

// 风险偏好装饰类
public class RiskPreferenceDecorator extends RecommendationDecorator {
    public RiskPreferenceDecorator(Recommendation recommendation) {
        super(recommendation);
    }

    @Override
    public void recommend() {
        super.recommend();
        addRiskPreference();
    }

    private void addRiskPreference() {
        System.out.println("添加基于风险偏好的推荐。");
    }
}
