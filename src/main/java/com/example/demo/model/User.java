package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(
    name = "users",
    uniqueConstraints = @UniqueConstraint(columnNames = "email")
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    private String role; // ADMIN / CUSTOMER

    public User() {}

    // getters and setters
}
