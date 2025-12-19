package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task_assignment")
public class TaskAssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    private String description;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}