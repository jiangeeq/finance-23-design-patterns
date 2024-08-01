package org.example.g02_cor_strategy_templateMethod;

import org.example.g02_cor_strategy_templateMethod.chains.CreditCheckHandler;
import org.example.g02_cor_strategy_templateMethod.chains.IdentityVerificationHandler;
import org.example.g02_cor_strategy_templateMethod.interfaces.RiskAssessment;
import org.example.g02_cor_strategy_templateMethod.interfaces.RiskHandler;
import org.example.g02_cor_strategy_templateMethod.interfaces.RiskStrategy;
import org.example.g02_cor_strategy_templateMethod.strategy.HighRiskStrategy;

/**
 *  风控系统
 *
 * 使用设计模式：
 *      责任链模式：不同的风险控制步骤按顺序处理。
 *      策略模式：选择不同的风险控制策略。
 *      模板方法模式：定义风险评估的基本流程。
 */
public class Main {
    public static void main(String[] args) {
        RiskRequest request = new RiskRequest();
        request.setName("jonh");
        boolean isOk = chainHandlers(request);
        if(isOk) {
            RiskStrategy strategy = new HighRiskStrategy();
            RiskAssessment assessment = new LoanRiskAssessment(strategy);
            assessment.assessRisk(request);
        }else {
            System.out.println("责任链过滤检查失败");
        }

    }

    public static boolean chainHandlers(RiskRequest request ){
        RiskHandler identityHandler = new IdentityVerificationHandler();
        RiskHandler creditHandler = new CreditCheckHandler();
        identityHandler.setNextHandler(creditHandler);

        return identityHandler.handleRisk(request);
    }
}
