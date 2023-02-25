package com.rx.account.controller;

import com.rx.account.model.Account;
import com.rx.account.sdk.command.AccountCreatedOrUpdateCommand;
import com.rx.account.service.AccountService;
import com.rx.common.sdk.repsentation.ResponseJson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("{accountId}")
    public ResponseJson get(@PathVariable Long accountId) {
        Account account = accountService.obtainAccount(accountId);
        return ResponseJson.success();
    }

    @PostMapping("{accountId}")
    public void saveOrUpdate(@PathVariable Long accountId, @RequestBody AccountCreatedOrUpdateCommand command) {
        accountService.saveOrUpdateAccount(command);
    }

    @GetMapping("get")
    public void get() {
        System.out.println("get...");
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("123", "456", true);
        Subject subject = SecurityUtils.getSubject();
        System.out.println("subject:" + subject);
    }

}
