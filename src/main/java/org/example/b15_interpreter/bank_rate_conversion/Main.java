package org.example.b15_interpreter.bank_rate_conversion;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 解释器模式（Interpreter Pattern）是一种行为设计模式，它提供了一种方法来评估语言的语法或表达式。
 * 该模式用于需要解释特定语法或表达式的场景，例如编程语言解释器、数学表达式求值等。
 *
 * 关键点：
 *      抽象表达式：提供一个统一的接口，使得解释器能够处理各种不同类型的表达式。。
 *      终结符表达式：即最基本的元素，不需要进一步分解, 直接返回它代表的值或进行简单的计算。
 *      非终结符表达式：可以包含一个或多个子表达式。非终结符表达式通常会递归地调用其子表达式的解释方法。
 *      上下文：提供解释器所需的外部信息，帮助解释器完成表达式的解释。
 *
 * 应用场景: 1.计算复杂的财务公式，如净现值（NPV）、内部收益率（IRR）等。
 *      2.解释不同计息方式和频率之间的利率转换表达式。
 */
public class Main {
    public static void main(String[] args) {
        // 定义上下文，包含各银行的年利率
        Map<String, BigDecimal> rates = new HashMap<>();
        rates.put("ICBC", BigDecimal.valueOf(3.5)); // 工行年利率
        rates.put("ABC", BigDecimal.valueOf(3.6));  // 农行年利率
        rates.put("BOC", BigDecimal.valueOf(3.4));  // 中行年利率
        rates.put("CCB", BigDecimal.valueOf(3.7));  // 建行年利率

        Context context = new Context(rates);
        // 创建终结符表达式
        InterestRateExpression icbcRate = new BankInterestRate("ICBC");
        InterestRateExpression abcRate = new BankInterestRate("ABC");
        InterestRateExpression bocRate = new BankInterestRate("BOC");
        InterestRateExpression ccbRate = new BankInterestRate("CCB");
        // 创建非终结符表达式
        InterestRateExpression icbcMonthlyRate = new ConvertToMonthlyRate(icbcRate);
        InterestRateExpression abcMonthlyRate = new ConvertToMonthlyRate(abcRate);
        InterestRateExpression bocMonthlyRate = new ConvertToMonthlyRate(bocRate);
        InterestRateExpression ccbMonthlyRate = new ConvertToMonthlyRate(ccbRate);

        InterestRateExpression icbcDailyRate = new ConvertToDailyRate(icbcRate);
        InterestRateExpression abcDailyRate = new ConvertToDailyRate(abcRate);
        InterestRateExpression bocDailyRate = new ConvertToDailyRate(bocRate);
        InterestRateExpression ccbDailyRate = new ConvertToDailyRate(ccbRate);

        // 解释并输出结果
        System.out.println("ICBC Monthly Rate: " + icbcMonthlyRate.interpret(context));
        System.out.println("ABC Monthly Rate: " + abcMonthlyRate.interpret(context));
        System.out.println("BOC Monthly Rate: " + bocMonthlyRate.interpret(context));
        System.out.println("CCB Monthly Rate: " + ccbMonthlyRate.interpret(context));

        System.out.println("ICBC Daily Rate: " + icbcDailyRate.interpret(context));
        System.out.println("ABC Daily Rate: " + abcDailyRate.interpret(context));
        System.out.println("BOC Daily Rate: " + bocDailyRate.interpret(context));
        System.out.println("CCB Daily Rate: " + ccbDailyRate.interpret(context));
    }
}