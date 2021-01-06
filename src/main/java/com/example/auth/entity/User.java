package com.example.auth.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(
//        name = "users",
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = "username"),
//                @UniqueConstraint(columnNames = "email")
//        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    @Size(max = 255)
    private String username;

    @Column
    @NotBlank
    @Size(max = 255)
    @Email
    private String email;

    @Column
    @NotBlank
    @Size(min = 8)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
//            name = "user_roles",
//            joinColumns = @JoinColumn(name = "userId"),
//            inverseJoinColumns = @JoinColumn(name = "roleId")
     )
    private Set<Role> roles = new HashSet<>();

}
