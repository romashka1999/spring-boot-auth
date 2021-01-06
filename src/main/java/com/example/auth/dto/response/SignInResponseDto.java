package com.example.auth.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SignInResponseDto {
    private String type = "Bearer";

    private String accessToken;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public SignInResponseDto(String accessToken, Long id, String username, String email, List<String> roles) {
        this.accessToken = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
