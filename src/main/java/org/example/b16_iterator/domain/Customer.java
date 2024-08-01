package org.example.b16_iterator.domain;

import org.example.b16_iterator.aggregate.AccountList;

public class Customer {
    private String name;
    private AccountList accountList;

    public Customer(String name) {
        this.name = name;
        this.accountList = new AccountList();
    }

    public String getName() {
        return name;
    }

    public AccountList getAccountList() {
        return accountList;
    }

    public void addAccount(Account account) {
        this.accountList.addAccount(account);
    }

    public void removeAccount(Account account) {
        this.accountList.removeAccount(account);
    }
}
