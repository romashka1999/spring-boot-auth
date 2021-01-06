package com.example.auth.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class SignInRequestDto {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
