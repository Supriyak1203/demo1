package com.ty.profileapi.dto;

import jakarta.validation.constraints.NotBlank;

public class Signup {
    @NotBlank public String username;
    @NotBlank public String password;
    @NotBlank public String email;
    public String fullName;
}
