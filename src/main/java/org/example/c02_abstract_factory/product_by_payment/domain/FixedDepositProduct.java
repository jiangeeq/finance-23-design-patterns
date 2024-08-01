package org.example.c02_abstract_factory.product_by_payment.domain;

import org.example.c02_abstract_factory.product_by_payment.interfaces.InvestmentProduct;

// 实现具体的理财产品
public class FixedDepositProduct implements InvestmentProduct {
    @Override
    public void createProduct() {
        System.out.println("定期存款产品");
    }
}
