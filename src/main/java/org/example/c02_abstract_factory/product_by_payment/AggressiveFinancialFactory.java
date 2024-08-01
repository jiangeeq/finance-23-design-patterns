package org.example.c02_abstract_factory.product_by_payment;

import org.example.c02_abstract_factory.product_by_payment.domain.DebitCardPayment;
import org.example.c02_abstract_factory.product_by_payment.domain.TermFundProduct;
import org.example.c02_abstract_factory.product_by_payment.interfaces.InvestmentProduct;
import org.example.c02_abstract_factory.product_by_payment.interfaces.Payment;

// 实现抽象金融投资方案工厂接口-激进风险投资
public class AggressiveFinancialFactory implements FinancialFactory {
    @Override
    public InvestmentProduct createInvestmentProduct() {
        return new TermFundProduct();
    }

    @Override
    public Payment createPayment() {
        return new DebitCardPayment();
    }
}
