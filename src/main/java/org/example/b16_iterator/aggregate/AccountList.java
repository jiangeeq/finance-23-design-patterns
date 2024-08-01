package org.example.b16_iterator.aggregate;

import org.example.b16_iterator.domain.Account;
import org.example.b16_iterator.interfaces.Aggregate;
import org.example.b16_iterator.interfaces.Iterator;
import org.example.b16_iterator.iterator.AccountIterator;

import java.util.ArrayList;
import java.util.List;

public class AccountList implements Aggregate<Account> {
    private List<Account> accounts;

    public AccountList() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    @Override
    public Iterator<Account> createIterator() {
        return new AccountIterator(accounts);
    }
}
