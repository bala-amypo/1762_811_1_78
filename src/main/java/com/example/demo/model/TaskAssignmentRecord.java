package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "task_assignment_records")
public class TaskAssignmentRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long taskId;

    private Long volunteerId;

    private LocalDateTime assignedAt;

    private String status; // ACTIVE / COMPLETED / CANCELLED

    private String notes;

    @PrePersist
    public void onAssign() {
        this.assignedAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = "ACTIVE";
        }
    }

    public TaskAssignmentRecord() {}

    // getters and setters
}
