package org.example.b19_strategy.rates_and_charges;


import org.example.b19_strategy.rates_and_charges.impl.FixedFeeStrategy;
import org.example.b19_strategy.rates_and_charges.impl.FixedRateStrategy;
import org.example.b19_strategy.rates_and_charges.impl.PercentageFeeStrategy;
import org.example.b19_strategy.rates_and_charges.impl.VariableRateStrategy;

import java.math.BigDecimal;

/**
 *
 * 策略模式是一种行为设计模式，它定义了一系列算法，并将每个算法封装起来，使它们可以相互替换。策略模式使得算法可以独立于使用它的客户而变化。
 * 在金融业务中，策略模式常用于交易策略、风险评估、定价策略等场景，以便灵活地切换和扩展不同的业务逻辑。
 *
 * 关键点：
 *      策略（Strategy）：定义所有支持的算法的公共接口。
 *      具体策略（Concrete Strategy）：实现策略接口的具体算法。
 *      上下文（Context）：使用一个策略对象的引用来调用具体的算法。
 *
 * 应用场景: 1.风险评估：在风险管理系统中，根据不同的资产类别和市场条件选择不同的风险评估模型。
 *      2.定价策略：在电子商务平台中，根据客户类型和购买历史选择不同的产品定价策略。
 *      3.费用计算：在支付系统中，根据支付方式和交易金额选择不同的手续费计算方法。
 *      4.贷款利率计算：在银行系统中，根据客户信用评分和贷款期限选择不同的贷款利率计算方法。
 */
public class Main {
    public static void main(String[] args) {
        CalculationContext context = new CalculationContext();

        // 费用计算
        CalculationStrategy percentageFeeStrategy = new PercentageFeeStrategy(new BigDecimal("0.02"));
        CalculationStrategy fixedFeeStrategy = new FixedFeeStrategy(new BigDecimal("10.00"));

        context.setStrategy(percentageFeeStrategy);
        System.out.println("百分比收费的费用: " + context.executeStrategy(new BigDecimal("1000")));
        context.setStrategy(fixedFeeStrategy);
        System.out.println("固定收费的费用: " + context.executeStrategy(new BigDecimal("1000")));

        // 贷款利率计算
        CalculationStrategy fixedRateStrategy = new FixedRateStrategy(new BigDecimal("0.05")); // 5% 年利率
        CalculationStrategy variableRateStrategy = new VariableRateStrategy(new BigDecimal("0.03"), new BigDecimal("0.02")); // 基础利率 3%，加成 2%

        context.setStrategy(fixedRateStrategy);
        System.out.println("固定利率: " + context.executeStrategy(new BigDecimal("10000")));

        context.setStrategy(variableRateStrategy);
        System.out.println("可变利率: " + context.executeStrategy(new BigDecimal("10000")));
    }
}