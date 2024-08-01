package org.example.b16_iterator.iterator;

import org.example.b16_iterator.domain.Account;
import org.example.b16_iterator.interfaces.Iterator;

import java.util.List;

public class AccountIterator implements Iterator<Account> {
    private List<Account> accounts;
    private int position = 0;

    public AccountIterator(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean hasNext() {
        return position < accounts.size();
    }

    @Override
    public Account next() {
        return accounts.get(position++);
    }
}