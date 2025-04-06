package com.user.user.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Password {
    private String password;

    public void setPassword(String password) {
        if (!isValid(password)) {
            throw new IllegalArgumentException("Password must be at least 6 characters long, contain one uppercase letter and one special character.");
        }
        this.password = password;
    }

    private boolean isValid(String password) {
        if (password == null || password.length() < 6) return false;
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");
        return hasUppercase && hasSpecialChar;
    }
}
