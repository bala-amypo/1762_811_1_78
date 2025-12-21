package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "volunteer_skill_records")
public class VolunteerSkillRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long volunteerId;

    private String skillName;

    private String skillLevel; // BEGINNER / INTERMEDIATE / EXPERT

    private Boolean certified;

    private LocalDateTime updatedAt;

    @PrePersist
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public VolunteerSkillRecord() {}

    // getters and setters
}
