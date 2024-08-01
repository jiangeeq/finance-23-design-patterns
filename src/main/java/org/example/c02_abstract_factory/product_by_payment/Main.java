package org.example.c02_abstract_factory.product_by_payment;

import org.example.c02_abstract_factory.product_by_payment.interfaces.InvestmentProduct;
import org.example.c02_abstract_factory.product_by_payment.interfaces.Payment;

import java.util.Scanner;

/**
 * 抽象工厂模式是一种创建型设计模式，它提供一个接口，用于创建一系列相关或依赖的对象，而无需指定它们的具体类。
 * 通过这个模式，客户端可以在不指定具体类的情况下，生成一系列相关的对象。通过这种方式，可以实现代码的高内聚和低耦合，提高系统的灵活性和可扩展性。
 *
 * 关键点
 * 1.抽象工厂接口：定义了创建一系列相关对象的方法。
 * 2.具体工厂类：实现抽象工厂接口，创建具体的产品对象。
 * 3.抽象产品接口：为一类产品定义接口。
 * 4.具体产品类：实现抽象产品接口，提供具体的产品实现。
 * 5.客户端：使用抽象工厂接口来创建具体的产品对象。
 *
 * 应用场景: 1.不同地区的银行可能会提供不同的账户类型和贷款产品。抽象工厂模式可以根据地区创建相应的账户和贷款产品。
 2. 在金融机构中，理财产品和支付方式经常是紧密相关的。使用抽象工厂模式，可以创建不同策略的理财产品和支付方式
 3. 金融系统中的交易处理系统需要处理不同类型的交易（如存款、取款和转账）以及不同的交易渠道（如网银、手机银行和ATM）。通过抽象工厂模式，我们可以为不同的渠道提供相应的交易处理对象。
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入投资方式：‘保守’ or ‘激进’");
        String in = new Scanner(System.in).nextLine();
        if(in.contains("保守")){
            FinancialFactory conservativeFactory = new ConservativeFinancialFactory();
            InvestmentProduct conservativeProduct = conservativeFactory.createInvestmentProduct();
            Payment conservativePayment = conservativeFactory.createPayment();
            conservativeProduct.createProduct();
            conservativePayment.processPayment();
        }else if (in.contains("激进")){
            FinancialFactory aggressiveFactory = new AggressiveFinancialFactory();
            InvestmentProduct aggressiveProduct = aggressiveFactory.createInvestmentProduct();
            Payment aggressivePayment = aggressiveFactory.createPayment();
            aggressiveProduct.createProduct();
            aggressivePayment.processPayment();
        }
    }
}
