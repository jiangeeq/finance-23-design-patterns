package org.example.s08_composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// 借贷组合类
public class LoanPortfolio implements LoanComponent{
    private List<LoanComponent> loans = new ArrayList<>();

    public void addLoan(LoanComponent loan) {
        loans.add(loan);
    }
    public void removeLoan(LoanComponent loan) {
        loans.remove(loan);
    }

    /**
     * 展示借贷详情：展示所有借贷项目的详细信息，包括借款人、贷款金额等。
     */
    @Override
    public void showDetails() {
        // 打印当前组合中的组合类型
        loans.forEach(LoanComponent::showDetails);
    }

    /**
     * 计算总贷款金额：计算一个组合内所有借贷项目的总贷款金额。
     * @return
     */
    @Override
    public BigDecimal getAmount() {
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (LoanComponent loan : loans) {
            totalAmount = totalAmount.add(loan.getAmount());
        }

        return totalAmount;
    }
}
