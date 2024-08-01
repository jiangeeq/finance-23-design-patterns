package org.example.b13_chain_of_responsibility.loan_approval;


import org.example.b13_chain_of_responsibility.loan_approval.impl.CreditScoreHandler;
import org.example.b13_chain_of_responsibility.loan_approval.impl.FinalApprovalHandler;
import org.example.b13_chain_of_responsibility.loan_approval.impl.InitialApprovalHandler;
import org.example.b13_chain_of_responsibility.loan_approval.impl.RiskAssessmentHandler;
import org.example.b13_chain_of_responsibility.loan_approval.interfaces.LoanApprovalHandler;
import org.example.s12_proxy.stock_price_cache.StockPriceService;
import org.example.s12_proxy.stock_price_cache.StockPriceServiceCacheProxy;
import org.example.s12_proxy.stock_price_cache.StockPriceServiceImpl;

/**
 *
 * 职责链模式（Chain of Responsibility Pattern）是一种行为设计模式，允许多个对象都有机会处理请求，从而避免请求的发送者与接收者之间的耦合。
 * 将这些对象连接成一条链，并沿着这条链传递请求，直到有一个对象处理它为止。
 *
 * 关键点：
 *      1.职责链：将多个处理对象连接成一条链。
 *      2.请求传递：请求在链上流动，直到被某个对象处理。
 *      3.松散耦合：请求发送者和处理者解耦，发送者无需知道谁会处理请求。
 *      4.动态组合：可以动态地改变处理链的结构。
 *
 * 应用场景: 1.贷款申请需要经过多个审批步骤：初审、信用评分、风险评估、最终审批等。每个步骤由不同的审批人员或系统处理
 *      2.银行交易需要经过验证、风控、反洗钱检查、清算等多个环节。每个环节都有相应的系统模块或人员进行处理。
 *      3.投资组合需要经过多个分析步骤：市场分析、风险评估、收益预测等。每个步骤由不同的专家或系统模块完成。
 *      4.账单支付从接收、验证、扣款、确认到通知用户。每个环节由不同的系统模块处理，确保支付过程的准确性和安全性。
 */
public class Main {
    public static void main(String[] args) {
        LoanApprovalHandler initialApproval = new InitialApprovalHandler();
        LoanApprovalHandler creditScore = new CreditScoreHandler();
        LoanApprovalHandler riskAssessment = new RiskAssessmentHandler();
        LoanApprovalHandler finalApproval = new FinalApprovalHandler();

        initialApproval.setNextHandler(creditScore);
        creditScore.setNextHandler(riskAssessment);
        riskAssessment.setNextHandler(finalApproval);

        LoanRequest request = new LoanRequest(120000, "John Doe");
        initialApproval.handleRequest(request);
    }
}