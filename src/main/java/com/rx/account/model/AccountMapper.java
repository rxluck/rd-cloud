package com.rx.account.model;

import java.util.List;

public interface AccountMapper {

    List<Account> loadAccounts();

    void saveAccount(Account account);
}
