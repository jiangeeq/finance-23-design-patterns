package org.example.s09_decorator.compliance_check.impl;

import org.example.s09_decorator.compliance_check.interfaces.Transaction;
import org.example.s09_decorator.compliance_check.interfaces.TransactionDecorator;

// 身份验证装饰类
public class IdentityVerificationDecorator extends TransactionDecorator {
    public IdentityVerificationDecorator(Transaction transaction) {
        super(transaction);
    }

    @Override
    public void process() {
        super.process();
        addIdentityVerification();
    }

    private void addIdentityVerification() {
        System.out.println("执行身份验证");
    }
}