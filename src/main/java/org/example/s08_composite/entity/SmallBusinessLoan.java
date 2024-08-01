package org.example.s08_composite.entity;

import org.example.s08_composite.LoanComponent;

import java.math.BigDecimal;

// 企业贷款项目
public class SmallBusinessLoan implements LoanComponent {
    private String businessName;
    private BigDecimal loanAmount;

    public SmallBusinessLoan(String businessName, BigDecimal loanAmount) {
        this.businessName = businessName;
        this.loanAmount = loanAmount;
    }
    @Override
    public void showDetails() {
        System.out.println("（企业贷款项目）小微企业公司名称= " + businessName + ", 借款金额 = " + loanAmount);
    }

    @Override
    public BigDecimal getAmount() {
        return loanAmount;
    }
}
