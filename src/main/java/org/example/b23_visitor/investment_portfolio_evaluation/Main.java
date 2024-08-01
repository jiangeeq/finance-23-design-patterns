package org.example.b23_visitor.investment_portfolio_evaluation;

import org.example.b23_visitor.investment_portfolio_evaluation.domain.Bond;
import org.example.b23_visitor.investment_portfolio_evaluation.domain.Stock;
import org.example.b23_visitor.investment_portfolio_evaluation.interfaces.Investment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *访问者模式（Visitor Pattern）是一种行为型设计模式，它允许在不改变数据结构的前提下，向数据结构中的元素添加新的功能。
 * 通过使用访问者模式，可以将数据结构和算法解耦，从而提高系统的可扩展性和灵活性。
 *
 * 关键点：
 *      访问者接口（Visitor）： 定义对每种元素访问的操作。
 *      具体访问者（ConcreteVisitor）： 实现访问者接口，定义对具体元素的操作。
 *      元素接口（Element）： 定义一个接受访问者的方法。
 *      具体元素（ConcreteElement）： 实现元素接口，定义接受访问者的方法。
 *
 * 应用场景: 1.风险评估： 对不同类型的金融产品进行风险评估。
 *      2.税务计算： 对不同类型的收入进行税务计算。
 *      3.投资组合评估： 对不同类型的投资（股票、债券、房地产等）进行价值评估。
 *      4.财务报表审计： 对不同类型的财务报表（资产负债表、利润表、现金流量表等）进行审计。
 *      5.客户信用评估： 对不同类型的客户进行信用评估。
 */
public class Main {
    public static void main(String[] args) {
        List<Investment> investments = new ArrayList<>();
        investments.add(new Stock("AAPL", 150.0));
        investments.add(new Bond("US Government", 1000.0));
        investments.add(new Stock("GOOGL", 1200.0));

        ValueVisitor valueVisitor = new ValueVisitor();
        for (Investment investment : investments) {
            investment.accept(valueVisitor);
        }

        System.out.println("总投资组合价值: " + valueVisitor.getTotalValue());
    }
}