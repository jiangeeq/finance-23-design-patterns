package org.example.c02_abstract_factory.product_by_payment;

import org.example.c02_abstract_factory.product_by_payment.interfaces.InvestmentProduct;
import org.example.c02_abstract_factory.product_by_payment.interfaces.Payment;

// 定义抽象金融投资方案工厂接口
public interface FinancialFactory {
    InvestmentProduct createInvestmentProduct();
    Payment createPayment();
}
