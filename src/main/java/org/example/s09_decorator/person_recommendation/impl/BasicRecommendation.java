package org.example.s09_decorator.person_recommendation.impl;

// 基本推荐实现
import org.example.s09_decorator.person_recommendation.interfaces.Recommendation;

public class BasicRecommendation implements Recommendation {
    @Override
    public void recommend() {
        System.out.println("推荐基础理财产品");
    }
}
