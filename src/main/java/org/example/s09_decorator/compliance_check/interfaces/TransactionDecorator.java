package org.example.s09_decorator.compliance_check.interfaces;

// 交易装饰器基类
public abstract class TransactionDecorator implements Transaction {

    private Transaction transaction;

    public TransactionDecorator(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void process() {
        transaction.process();
    }
}
