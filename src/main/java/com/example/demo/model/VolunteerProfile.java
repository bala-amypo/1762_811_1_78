package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
    name = "volunteer_profiles",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "volunteerId"),
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "phone")
    }
)
public class VolunteerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String volunteerId;

    private String fullName;

    private String email;

    private String phone;

    private String availabilityStatus; // AVAILABLE / BUSY / INACTIVE

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public VolunteerProfile() {}

    // getters and setters
}
