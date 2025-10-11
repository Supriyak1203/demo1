package com.ty.profileapi.dto;



import jakarta.validation.constraints.NotBlank;

public class Signin {
    @NotBlank public String username;
    @NotBlank public String password;
}
