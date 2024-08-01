package org.example.b22_template_method;

import org.example.b22_template_method.abstracts.PaymentProcessor;
import org.example.b22_template_method.impl.CreditCardPaymentProcessor;
import org.example.b22_template_method.impl.PayPalPaymentProcessor;

/**
 *
 *模板方法模式是一种行为设计模式，它定义了一个操作中的算法骨架，而将一些步骤延迟到子类中。
 * 通过这种方式，模板方法可以在不改变算法结构的情况下，重新定义算法的某些步骤。
 *
 * 关键点：
 *      抽象类：定义算法的骨架，并包含一个或多个模板方法。
 *      模板方法：在抽象类中定义，按某一固定顺序调用步骤。
 *      具体子类：实现抽象类中的步骤，并可能重写钩子方法以提供具体的实现。
 *
 * 应用场景: 1.信用卡交易处理 骨架流程：验证交易 -> 执行交易 -> 记录日志 -> 通知客户。
 *      2.贷款审批流程 骨架流程：初审 -> 风险评估 -> 审批 -> 发放贷款。
 *      3.支付网关处理  骨架流程：验证支付请求 -> 执行支付 -> 记录支付日志 -> 通知商户
 *      4.银行对账处理 骨架流程：读取交易数据 -> 对账处理 -> 生成对账报告 -> 发送报告。
 *      5.财务预测  骨架流程：数据收集 -> 模型计算 -> 结果分析 -> 生成报告。
 */
public class Main {
    public static void main(String[] args) {
        PaymentRequest creditCardRequest = new PaymentRequest("TXN123", 100.0, "USD", "CreditCard");
        PaymentRequest paypalRequest = new PaymentRequest("TXN124", 200.0, "USD", "PayPal");

        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        // 通过模板方法模式，可以确保不同支付方式的处理流程一致，同时允许不同支付方式在具体步骤上有所不同。
        creditCardProcessor.processPayment(creditCardRequest);
        System.out.println();
        paypalProcessor.processPayment(paypalRequest);
    }
}