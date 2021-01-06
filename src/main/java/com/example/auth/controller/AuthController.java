package com.example.auth.controller;

import com.example.auth.dto.request.SignInRequestDto;
import com.example.auth.dto.request.SignUpRequestDto;
import com.example.auth.dto.response.SignInResponseDto;
import com.example.auth.dto.response.SignUpResponseDto;
import com.example.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/signin")
    public ResponseEntity<?> signInUser(@Valid @RequestBody SignInRequestDto signInRequestDto) {
        return authService.signInUser(signInRequestDto);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUpUser(@Valid @RequestBody SignUpRequestDto signUpRequestDto) {
        return authService.signUpUser(signUpRequestDto);
    }
}
