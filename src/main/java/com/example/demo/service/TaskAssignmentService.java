package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.TaskRecordAssignmentEntity;

public interface TaskAssignmentService {

    TaskRecordAssignmentEntity create(TaskRecordAssignmentEntity task);

    List<TaskRecordAssignmentEntity> getAll();

    TaskRecordAssignmentEntity getById(Long id);

    TaskRecordAssignmentEntity update(Long id, TaskRecordAssignmentEntity task);

    void delete(Long id);
}