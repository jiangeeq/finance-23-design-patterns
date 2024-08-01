package org.example.b20_state.impl;

import org.example.b20_state.LoanContext;
import org.example.b20_state.LoanState;

// 待审批状态，处理请求后转到 UnderReviewState
public class PendingState implements LoanState {
    @Override
    public void handleRequest(LoanContext context) {
        System.out.println("Loan is pending approval.");
        context.setState(new UnderReviewState());
    }
}