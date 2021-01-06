package com.example.auth.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
@Entity
//@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private ERole name;
}
