package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskAssignmentEntity;
import com.example.demo.repository.TaskAssignmentRepository;
import com.example.demo.service.TaskAssignmentService;

@Service
public class TaskAssignmentServiceImpl implements TaskAssignmentService {

    @Autowired
    private TaskAssignmentRepository repository;

    @Override
    public TaskAssignmentEntity create(TaskAssignmentEntity task) {
        return repository.save(task);
    }

    @Override
    public List<TaskAssignmentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public TaskAssignmentEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public TaskAssignmentEntity update(Long id, TaskAssignmentEntity task) {
        TaskAssignmentEntity existing = repository.findById(id).orElse(null);

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
