package com.example.demo.entity;

import java.time.ZonedDateTime;

public class User {
    private Integer userInfoId;
    private String userName;
    private String userPhone;
    private String userEmail;
    private ZonedDateTime datachangeCreatetime;
    private ZonedDateTime datachangeLasttime;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public ZonedDateTime getDatachangeCreatetime() {
        return datachangeCreatetime;
    }

    public void setDatachangeCreatetime(ZonedDateTime datachangeCreatetime) {
        this.datachangeCreatetime = datachangeCreatetime;
    }

    public ZonedDateTime getDatachangeLasttime() {
        return datachangeLasttime;
    }

    public void setDatachangeLasttime(ZonedDateTime datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }
}
