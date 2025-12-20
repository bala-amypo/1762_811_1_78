package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.TaskAssignmentEntity;

public interface TaskAssignmentService {

    TaskAssignmentEntity create(TaskAssignmentEntity task);

    List<TaskAssignmentEntity> getAll();

    TaskAssignmentEntity getById(Long id);

    TaskAssignmentEntity update(Long id, TaskAssignmentEntity task);

    void delete(Long id);
}
