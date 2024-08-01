package org.example.s08_composite;

import org.example.s08_composite.entity.MortgageLoan;
import org.example.s08_composite.entity.PersonalLoan;
import org.example.s08_composite.entity.SmallBusinessLoan;

import java.math.BigDecimal;

/**
 *
 * 组合模式（Composite Pattern）是一种结构型设计模式，它允许你将对象组合成树形结构来表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 *
 * 应用场景: 1.在P2P金融平台上，有多种类型的借贷项目，包括个人贷款、企业贷款、和抵押贷款。平台需要一种方式来管理这些不同类型的借贷项目，并能够对借贷项目进行统一的操作，如展示借贷详情、计算总贷款金额等
 */
public class Main {
    public static void main(String[] args) {
        LoanComponent personalLoan1 = new PersonalLoan("Alice", BigDecimal.valueOf(5000));
        LoanComponent personalLoan2 = new PersonalLoan("Bob", BigDecimal.valueOf(8000));
        LoanComponent businessLoan1 = new SmallBusinessLoan("TechCorp", BigDecimal.valueOf(15000));
        LoanComponent mortgageLoan1 = new MortgageLoan("123 Main St", BigDecimal.valueOf(25000));

        // 个人借款组合
        LoanPortfolio personalLoanPortfolio = new LoanPortfolio();
        personalLoanPortfolio.addLoan(personalLoan1);
        personalLoanPortfolio.addLoan(personalLoan2);
        // 企业借款组合
        LoanPortfolio businessLoanPortfolio = new LoanPortfolio();
        businessLoanPortfolio.addLoan(businessLoan1);
        // 抵押借款组合
        LoanPortfolio masterLoanPortfolio = new LoanPortfolio();
        masterLoanPortfolio.addLoan(mortgageLoan1);

        getLoanPortfolioInfo("个人借款", personalLoanPortfolio);
        getLoanPortfolioInfo("企业借款", businessLoanPortfolio);
        getLoanPortfolioInfo("抵押借款", masterLoanPortfolio);
    }

    public static void getLoanPortfolioInfo(String loanMessage, LoanPortfolio loanPortfolio){
        System.out.println(loanMessage+"组合类目详情:");
        loanPortfolio.showDetails();
        System.out.println(loanMessage+"组合借款总金额: " + loanPortfolio.getAmount());

    }
}
