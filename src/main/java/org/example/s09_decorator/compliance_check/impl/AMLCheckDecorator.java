package org.example.s09_decorator.compliance_check.impl;

import org.example.s09_decorator.compliance_check.interfaces.Transaction;
import org.example.s09_decorator.compliance_check.interfaces.TransactionDecorator;

// 反洗钱检查装饰类
public class AMLCheckDecorator extends TransactionDecorator {
    public AMLCheckDecorator(Transaction transaction) {
        super(transaction);
    }

    @Override
    public void process() {
        super.process();
        addAMLCheck();
    }

    private void addAMLCheck(){
        System.out.println("执行反洗钱检查");
    }
}
