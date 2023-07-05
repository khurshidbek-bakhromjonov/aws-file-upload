package com.company.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
