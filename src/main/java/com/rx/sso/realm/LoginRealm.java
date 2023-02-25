package com.rx.sso.realm;

import com.rx.account.model.Account;
import com.rx.account.service.AccountService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LoginRealm extends AuthorizingRealm {

    @Resource
    private AccountService accountService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("doGetAuthorizationInfo...");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("doGetAuthenticationInfo...");
        String username = (String) authenticationToken.getPrincipal();
        Account account = accountService.obtainAccountByMobileNumber(username);
        if ("13219009557".equals(username)) {
            return new SimpleAuthenticationInfo(username,"123456",this.getName());
        }
        return null;
    }
}
