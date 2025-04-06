package com.user.user.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private String phone;

    public void setPhone(String phone) {
        if (!isValid(phone)) {
            throw new IllegalArgumentException("Invalid phone number.");
        }
        this.phone = phone;
    }

    private boolean isValid(String phone) {
        if (phone == null) return false;
        String cleaned = phone.replaceAll("[^\\d]", "");
        return cleaned.matches("\\d{10,15}");
    }
}
