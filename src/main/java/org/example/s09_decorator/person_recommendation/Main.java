package org.example.s09_decorator.person_recommendation;


import org.example.s09_decorator.compliance_check.impl.AMLCheckDecorator;
import org.example.s09_decorator.compliance_check.impl.BasicTransaction;
import org.example.s09_decorator.compliance_check.impl.IdentityVerificationDecorator;
import org.example.s09_decorator.compliance_check.interfaces.Transaction;
import org.example.s09_decorator.person_recommendation.impl.BasicRecommendation;
import org.example.s09_decorator.person_recommendation.impl.RiskPreferenceDecorator;
import org.example.s09_decorator.person_recommendation.impl.TransactionHistoryDecorator;
import org.example.s09_decorator.person_recommendation.interfaces.Recommendation;

/**
 *
 * 装饰模式（Decorator Pattern）是一种结构型设计模式，它允许在不改变对象接口的情况下，动态地给一个对象添加职责。装饰模式通过创建一个装饰类来包装原始类，从而增强或改变其功能。
 *
 * 关键点：
 *      1. 组合而不是继承：装饰模式采用组合而不是继承来扩展对象的功能，这避免了类爆炸的问题。
 *      2. 透明性：装饰模式遵循开放-封闭原则，对扩展开放，对修改封闭。新功能通过添加装饰类实现，而不是修改原有类。
 *      3. 灵活性：装饰类可以叠加使用，以动态地增加或改变对象的行为。
 *      4. 单一职责原则：每个装饰类只负责一个特定的增强功能，简化了职责划分。
 *
 * 应用场景: 1.动态调整交易费率：客户的交易费用根据不同的账户级别和市场条件进行调整。基本账户有固定费率，高级账户可以根据交易量或时间段享受折扣
 *      2.个性化推荐系统：向客户推荐定制化的金融产品和服务，如投资建议、贷款产品等。在基本推荐算法上添加不同的个性化装饰类，如风险偏好装饰、历史交易装饰。
 *      3.在进行交易时，需要根据不同的监管要求进行合规检查，可以在基本交易功能上添加不同的合规检查装饰类，如反洗钱检查装饰、身份验证装饰、交易限制检查装饰。
 */
public class Main {
    public static void main(String[] args) {
        Recommendation recommendation = new BasicRecommendation();
        recommendation = new RiskPreferenceDecorator(recommendation);
        recommendation = new TransactionHistoryDecorator(recommendation);

        recommendation.recommend();
    }
}
