package com.example.demo.service;

import com.example.demo.entity.TaskRecordAssignmentEntity;
import java.util.List;

public interface TaskAssignmentService {

    TaskRecordAssignmentEntity create(TaskRecordAssignmentEntity task);

    TaskRecordAssignmentEntity update(Long id, TaskRecordAssignmentEntity task);

    TaskRecordAssignmentEntity getById(Long id);

    List<TaskRecordAssignmentEntity> getAll();

    void delete(Long id);
}