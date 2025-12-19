package com.example.demo.service.impl;

import com.example.demo.entity.TaskRecordAssignmentEntity;
import com.example.demo.repository.TaskAssignmentRepository;
import com.example.demo.service.TaskAssignmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskAssignmentServiceImpl implements TaskAssignmentService {

    private final TaskAssignmentRepository repository;

    public TaskAssignmentServiceImpl(TaskAssignmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public TaskRecordAssignmentEntity create(TaskRecordAssignmentEntity task) {
        return repository.save(task);
    }

    @Override
    public TaskRecordAssignmentEntity update(Long id, TaskRecordAssignmentEntity task) {
        task.setId(id);
        return repository.save(task);
    }

    @Override
    public TaskRecordAssignmentEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<TaskRecordAssignmentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}