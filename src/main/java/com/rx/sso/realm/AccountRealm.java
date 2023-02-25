package com.rx.sso.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.context.annotation.Bean;

//@Configuration
public class AccountRealm {
    @Bean
    public Realm realm() {
       return new Realm() {
           @Override
           public String getName() {
               return "JDBC";
           }

           @Override
           public boolean supports(AuthenticationToken authenticationToken) {
               return true;
           }

           @Override
           public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
               return new AuthenticationInfo() {
                   @Override
                   public PrincipalCollection getPrincipals() {
                       return null ;
                   }

                   @Override
                   public Object getCredentials() {
                       return authenticationToken.getCredentials();
                   }
               };
           }
       };
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        // login users with the 'admin' role
        chainDefinition.addPathDefinition("/admin/**", "authc, roles[admin]");
        // login users with the 'document:read' permission
        chainDefinition.addPathDefinition("/docs/**", "authc, perms[document:read]");
        // all other paths require a login user
        chainDefinition.addPathDefinition("/**", "authc");
        return chainDefinition;
    }
}
