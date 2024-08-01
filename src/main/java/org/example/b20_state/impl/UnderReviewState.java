package org.example.b20_state.impl;


import org.example.b20_state.LoanContext;
import org.example.b20_state.LoanState;

// 审批中状态，处理请求后转到 ApprovedState
public class UnderReviewState implements LoanState {
    @Override
    public void handleRequest(LoanContext context) {
        System.out.println("Loan is under review.");
        context.setState(new ApprovedState());
    }
}