package org.example.s08_composite.entity;

import org.example.s08_composite.LoanComponent;

import java.math.BigDecimal;

// 个人贷款项目
public class PersonalLoan implements LoanComponent {
    private String borrowerName;
    private BigDecimal loanAmount;

    public PersonalLoan(String borrowerName, BigDecimal loanAmount) {
        this.borrowerName = borrowerName;
        this.loanAmount = loanAmount;
    }

    @Override
    public void showDetails() {
        System.out.println("（个人贷款项目）借款人名称 = " + borrowerName + ", 借款金额 = " + loanAmount);

    }

    @Override
    public BigDecimal getAmount() {
        return loanAmount;
    }
}
