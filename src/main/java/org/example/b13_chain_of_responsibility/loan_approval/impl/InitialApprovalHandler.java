package org.example.b13_chain_of_responsibility.loan_approval.impl;

import org.example.b13_chain_of_responsibility.loan_approval.LoanRequest;
import org.example.b13_chain_of_responsibility.loan_approval.interfaces.LoanApprovalHandler;
//初始审批处理
public class InitialApprovalHandler implements LoanApprovalHandler {
    private LoanApprovalHandler nextHandler;

    @Override
    public void setNextHandler(LoanApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoanRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("初始审批处理: " + request.getApplicantName());
        } else {
            if (nextHandler != null) {
                System.out.println("执行下一处理" + nextHandler.getClass().getSimpleName());
                nextHandler.handleRequest(request);

            }
        }
    }
}
