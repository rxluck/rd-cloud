package com.rx.account.service;

import com.rx.account.model.Account;
import com.rx.account.model.AccountMapper;
import com.rx.account.sdk.command.AccountCreatedOrUpdateCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    public Account obtainAccount(Long accountId) {
        return accountMapper.selectAccountById(accountId);
    }

    public List<Account> obtainAccounts() {
        return accountMapper.loadAccounts();
    }

    public void registry(AccountCreatedOrUpdateCommand command) {
        String name = command.getName();
        Integer age = command.getAge();
        String avatar = command.getAvatar();
        Integer gender = command.getGender();
        String mobileNumber = command.getMobileNumber();
        String description = command.getDescription();

        Account account = new Account(null, 123456L, name, age, avatar, mobileNumber, description, gender);
        accountMapper.insertAccount(account);
    }

    public void registry() {

    }

    public Account obtainAccountByMobileNumber(String mobileNumber) {
        return accountMapper.loadAccountByMobileNumber(mobileNumber);
    }
}
