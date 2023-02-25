package com.rx.account.model;

import java.util.List;

public interface AccountRepository {

    List<Account> loadAccounts();

    void saveAccount(Account account);

}
