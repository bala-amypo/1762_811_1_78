package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    @Column(unique=true)
    private String email;
    private String password;
    private String role;
   

    public UserEntity(Long id, String fullname, String email, String password,String role) {
        // this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.role=role;
    }

    public UserEntity() {
        
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    public void SetRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
