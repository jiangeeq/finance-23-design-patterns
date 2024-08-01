package org.example.s09_decorator.compliance_check.impl;

import org.example.s09_decorator.compliance_check.interfaces.Transaction;

// 基本交易实现
public class BasicTransaction implements Transaction {
    @Override
    public void process() {
        System.out.println("处理基本交易");
    }
}
