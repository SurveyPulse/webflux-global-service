package com.example.global.entity;

public class BasicUserImpl implements BasicUser {
    private final String username;
    private final String password;
    private final String role;

    public BasicUserImpl(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getRole() {
        return role;
    }
}
