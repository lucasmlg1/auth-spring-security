package com.example.auth.domain.product;

import com.example.auth.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
