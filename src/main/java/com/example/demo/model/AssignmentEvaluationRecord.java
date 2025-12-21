package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "assignment_evaluation_records")
public class AssignmentEvaluationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long assignmentId;

    private Integer rating; // 1 - 5

    private String feedback;

    private LocalDateTime evaluatedAt;

    @PrePersist
    public void onEvaluate() {
        this.evaluatedAt = LocalDateTime.now();
    }

    public AssignmentEvaluationRecord() {}

    // getters and setters
}
