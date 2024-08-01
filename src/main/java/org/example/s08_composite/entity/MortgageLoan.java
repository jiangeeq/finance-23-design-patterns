package org.example.s08_composite.entity;

import org.example.s08_composite.LoanComponent;

import java.math.BigDecimal;

// 抵押贷款项目
public class MortgageLoan implements LoanComponent {
    private String propertyAddress;
    private BigDecimal loanAmount;

    public MortgageLoan( String propertyAddress, BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
        this.propertyAddress = propertyAddress;
    }

    @Override
    public void showDetails() {
        System.out.println("（抵押贷款项目）抵押贷款房产地址= " + propertyAddress + ", 借款金额 = " + loanAmount);
    }

    @Override
    public BigDecimal getAmount() {
        return loanAmount;
    }
}
