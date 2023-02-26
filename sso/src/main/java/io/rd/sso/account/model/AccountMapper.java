package io.rd.sso.account.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

    List<Account> loadAccounts();

    void insertAccount(Account account);

    Account loadAccountByMobileNumber(@Param("phone")String phone);

    Account selectAccountById(Long accountId);
}
