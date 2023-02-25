package com.rx.account.infrastructure;

import com.rx.account.model.Account;
import com.rx.account.model.AccountMapper;
import com.rx.account.model.AccountRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> loadAccounts() {
        return accountMapper.loadAccounts();
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
    }
}
