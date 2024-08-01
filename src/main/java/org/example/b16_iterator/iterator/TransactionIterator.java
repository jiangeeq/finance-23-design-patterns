package org.example.b16_iterator.iterator;


import org.example.b16_iterator.domain.Transaction;
import org.example.b16_iterator.interfaces.Iterator;

import java.util.List;
// 具体迭代器
public class TransactionIterator implements Iterator<Transaction> {
    private List<Transaction> transactions;
    private int position = 0;


    public TransactionIterator(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean hasNext() {
        return position < transactions.size();
    }

    @Override
    public Transaction next() {
        return transactions.get(position++);
    }
}
