package com.example.auth.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
public class SignUpRequestDto {
    @NotBlank
    @Size(min = 3, max = 255)
    private String username;

    @NotBlank
    @Size(max = 255)
    @Email
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;

    private Set<String> role;
}
