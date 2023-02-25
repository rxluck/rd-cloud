package com.rx.account.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

    List<Account> loadAccounts();

    void insertAccount(Account account);

    Account loadAccountByMobileNumber(@Param("mobileNumber")String mobileNumber);

    Account selectAccountById(Long accountId);
}
