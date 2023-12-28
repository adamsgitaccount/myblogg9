package com.myblogg9.payload;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class LoginDto {

    @NotBlank(message = "Username or email cannot be blank")
    private String usernameOrEmail;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    // Default constructor
    public LoginDto() {
    }

    // Parameterized constructor
    public LoginDto(String usernameOrEmail, String password) {
        this.usernameOrEmail = usernameOrEmail;
        this.password = password;
    }
}

