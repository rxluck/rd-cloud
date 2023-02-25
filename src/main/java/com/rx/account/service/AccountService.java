package com.rx.account.service;

import com.rx.account.model.Account;
import com.rx.account.model.AccountRepository;
import com.rx.account.sdk.command.AccountCreatedOrUpdateCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Resource
    private AccountRepository accountRepository;
    public Account obtainAccount(Long accountId) {
        return new Account();
    }

    public List<Account> obtainAccounts() {
        return accountRepository.loadAccounts();
    }

    public void saveOrUpdateAccount(AccountCreatedOrUpdateCommand command) {
        String name = command.getName();
        Integer age = command.getAge();
        String avatar = command.getAvatar();
        Integer gender = command.getGender();
        String mobileNumber = command.getMobileNumber();
        String description = command.getDescription();

        Account account = new Account(null, 123456L, name, age, avatar, mobileNumber, description, gender);
        accountRepository.saveAccount(account);
    }

    public void registry() {

    }

    public void obtainAccountByUserNameAndPassword() {

    }
}
