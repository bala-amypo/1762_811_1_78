package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TaskAssignmentEntity;

public interface TaskAssignmentRepository
        extends JpaRepository<TaskAssignmentEntity, Long> {
}
