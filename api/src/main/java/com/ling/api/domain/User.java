package com.ling.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by Lian on 05/10/2019.
 */
public class User implements Serializable{
    private Long id;
    private String userName;
    private String password;
    private LocalDateTime regTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }
}
