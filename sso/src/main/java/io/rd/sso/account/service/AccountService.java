package io.rd.sso.account.service;

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

    public void registry(AccountCreatedOrUpdateCommand command) {
        Account account = Account.registry(command);
        accountMapper.insertAccount(account);
    }

    public Account obtainAccount(Long accountId) {
        return accountMapper.selectAccountById(accountId);
    }

    public Account obtainAccountByMobileNumber(String mobileNumber) {
        return accountMapper.loadAccountByMobileNumber(mobileNumber);
    }

    public List<Account> obtainAccounts() {
        return accountMapper.loadAccounts();
    }
}
