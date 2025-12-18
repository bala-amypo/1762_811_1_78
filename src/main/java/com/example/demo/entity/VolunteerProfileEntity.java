package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VolunteerProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    private String phone;
    private String availabilityStatus;
   

    public VolunteerProfileEntity(Long id, String fullname, String email, String phone,String availabilityStatus) {
        // this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.availabilityStatus=availabilityStatus;
    }

    public StudentEntity() {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return this.cgpa;
    }
}
