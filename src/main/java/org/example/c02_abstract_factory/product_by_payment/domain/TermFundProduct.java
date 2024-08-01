package org.example.c02_abstract_factory.product_by_payment.domain;

import org.example.c02_abstract_factory.product_by_payment.interfaces.InvestmentProduct;

public class TermFundProduct implements InvestmentProduct {
    @Override
    public void createProduct() {
        System.out.println("定期基金产品");
    }
}
