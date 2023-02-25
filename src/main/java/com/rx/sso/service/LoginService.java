package com.rx.sso.service;

import com.rx.account.model.Account;
import com.rx.sso.sdk.command.AccountLoginCommand;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {

    public void login (AccountLoginCommand command) {
        String username = command.getUsername();
        String password = command.getPassword();
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username, password));

            Account account = (Account) subject.getPrincipal();
            if (Objects.isNull(account)) {
                System.out.println("account is null");
            } else {
                System.out.println("exists account");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
