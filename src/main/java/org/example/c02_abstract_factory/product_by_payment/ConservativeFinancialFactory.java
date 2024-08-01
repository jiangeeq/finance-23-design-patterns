package org.example.c02_abstract_factory.product_by_payment;

import org.example.c02_abstract_factory.product_by_payment.domain.CreditCardPayment;
import org.example.c02_abstract_factory.product_by_payment.domain.FixedDepositProduct;
import org.example.c02_abstract_factory.product_by_payment.interfaces.InvestmentProduct;
import org.example.c02_abstract_factory.product_by_payment.interfaces.Payment;

// 实现抽象金融投资方案工厂接口-稳健保守投资
public class ConservativeFinancialFactory implements FinancialFactory {

    @Override
    public InvestmentProduct createInvestmentProduct() {
        return new FixedDepositProduct();
    }

    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
