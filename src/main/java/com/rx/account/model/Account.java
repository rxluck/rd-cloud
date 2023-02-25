package com.rx.account.model;

public class Account {
    private Integer id;
    private Long guid;
    private String name;
    private Integer age;
    private String avatar;
    private String mobileNumber;
    private String description;
    private Integer gender;

    public Account() {
    }

    public Account(Integer id, Long guid, String name, Integer age, String avatar, String mobileNumber, String description, Integer gender) {
        this.id = id;
        this.guid = guid;
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.mobileNumber = mobileNumber;
        this.description = description;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getGuid() {
        return guid;
    }

    public void setGuid(Long guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
