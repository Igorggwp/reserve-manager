package com.user.user.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    private String email;

    public void setEmail(String email) {
        if (email == null || !isValid(email)) {
            throw new IllegalArgumentException("Invalid email.");
        }
        this.email = email;
    }

    private boolean isValid(String email) {
      String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
      return email.matches(regex);
  }
}
