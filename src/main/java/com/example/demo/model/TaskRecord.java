package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
    name = "task_records",
    uniqueConstraints = @UniqueConstraint(columnNames = "taskCode")
)
public class TaskRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskCode;

    private String taskName;

    private String requiredSkill;

    private String requiredSkillLevel;

    private String priority;

    private String status; // OPEN by default

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = "OPEN";
        }
    }

    public TaskRecord() {}

    // getters and setters
}
