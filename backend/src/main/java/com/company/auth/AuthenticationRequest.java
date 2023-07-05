package com.company.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}