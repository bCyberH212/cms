package com.example.cms.DTO;

import lombok.Getter;

@Getter
public class LoginForm {
    private String username;

    private String password;

    private boolean rememberMe;
}
