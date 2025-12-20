package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskRecordAssignmentEntity;
import com.example.demo.repository.TaskAssignmentRepository;
import com.example.demo.service.TaskAssignmentService;

@Service
public class TaskAssignmentServiceImpl implements TaskAssignmentService {

    @Autowired
    private TaskAssignmentRepository repository;

    @Override
    public TaskRecordAssignmentEntity create(TaskRecordAssignmentEntity task) {
        return repository.save(task);
    }

    @Override
    public List<TaskRecordAssignmentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public TaskRecordAssignmentEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public TaskRecordAssignmentEntity update(Long id, TaskRecordAssignmentEntity task) {
        TaskRecordAssignmentEntity existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTaskName(task.getTaskName());
            existing.setAssignedTo(task.getAssignedTo());
            existing.setStatus(task.getStatus());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}