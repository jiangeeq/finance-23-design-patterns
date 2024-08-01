package org.example.b15_interpreter.financial_formula_expression;


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
        // 定义上下文，包含变量和现金流
        Map<String, BigDecimal> variables = new HashMap<>();
        variables.put("cashFlow1", BigDecimal.valueOf(-1000.0));
        variables.put("cashFlow2", BigDecimal.valueOf(300.0));
        variables.put("cashFlow3", BigDecimal.valueOf(400.0));
        variables.put("cashFlow4", BigDecimal.valueOf(500.0));
        Context context = new Context(variables);
        // 创建终结符表达式
        FinancialExpression cashFlow1 = new VariableExpression("cashFlow1");
        FinancialExpression cashFlow2 = new VariableExpression("cashFlow2");
        FinancialExpression cashFlow3 = new VariableExpression("cashFlow3");
        FinancialExpression cashFlow4 = new VariableExpression("cashFlow4");

        // 创建非终结符表达式
        FinancialExpression npvExpression = new NPVExpression(0.1, cashFlow1, cashFlow2, cashFlow3, cashFlow4);
        BigDecimal npv = npvExpression.interpret(context);
        System.out.println("NPV: " + npv);

        FinancialExpression irrExpression = new IRRExpression(cashFlow1, cashFlow2, cashFlow3, cashFlow4);
        BigDecimal irr = irrExpression.interpret(context);
        System.out.println("IRR: " + irr);
    }
}