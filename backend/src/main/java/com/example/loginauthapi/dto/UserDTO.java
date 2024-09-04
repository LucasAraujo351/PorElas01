package com.example.loginauthapi.dto;

import com.example.loginauthapi.domain.user.User;

public record UserDTO(String name, String email, String password) {

    public User toEntity() {
        User user = new User();
        user.setName(this.name);
        user.setEmail(this.email);
        user.setPassword(this.password);
        return user;
    }
}
