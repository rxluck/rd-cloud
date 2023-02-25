package com.rx.account.controller;

import com.rx.account.model.Account;
import com.rx.account.sdk.command.AccountCreatedOrUpdateCommand;
import com.rx.account.service.AccountService;
import com.rx.common.sdk.repsentation.ResponseJson;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("api/v1/accounts/{accountId}")
    public ResponseJson get(@PathVariable Long accountId) {
        Account account = accountService.obtainAccount(accountId);
        return ResponseJson.success(account);
    }

    @PostMapping("registry")
    public void registry(@RequestBody AccountCreatedOrUpdateCommand command) {
        accountService.registry(command);
    }

    @GetMapping("get")
    public void get() {
        System.out.println("get...");
    }
}
