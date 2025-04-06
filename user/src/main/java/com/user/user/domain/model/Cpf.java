package com.user.user.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cpf {
    private String cpf;

    public void setCpf(String cpf) {
        if (!isValid(cpf)) {
            throw new IllegalArgumentException("Invalid CPF.");
        }
        this.cpf = cpf;
    }

    private boolean isValid(String cpf) {
      if (cpf == null) return false;
      String cleaned = cpf.replaceAll("\\D", "");
      return cleaned.matches("\\d{11}");
  }
}
