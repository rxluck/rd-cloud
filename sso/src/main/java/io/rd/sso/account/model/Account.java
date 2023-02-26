package io.rd.sso.account.model;

import com.rx.account.sdk.command.AccountCreatedOrUpdateCommand;

import java.sql.Timestamp;
import java.util.UUID;

public class Account {
    private Integer id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String guid;
    private String name;
    private String phone;
    private String email;
    private String password;
    private String description;

    public Account() {
    }

    public static Account registry(AccountCreatedOrUpdateCommand command) {
        Account account = new Account();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        account.createTime = timestamp;
        account.guid = uuid;
        account.name = command.getName();
        account.phone = command.getPhone();
        account.email = command.getEmail();
        account.password = command.getPassword();
        account.description = command.getDescription();
        return account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
