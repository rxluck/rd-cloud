package com.rx.sso.controller;

import com.rx.sso.sdk.command.AccountLoginCommand;
import com.rx.sso.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @PostMapping("/login")
    public void login(@RequestBody AccountLoginCommand command) {
        loginService.login(command);
    }
}
