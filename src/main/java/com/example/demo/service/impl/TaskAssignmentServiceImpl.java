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
    private TaskAssignmentRepository repo;

    public TaskAssignmentEntity create(TaskAssignmentEntity task) {
        return repo.save(task);
    }

    public List<TaskAssignmentEntity> getAll() {
        return repo.findAll();
    }

    public TaskAssignmentEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public TaskAssignmentEntity update(Long id, TaskAssignmentEntity task) {
        TaskAssignmentEntity existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setTaskName(task.getTaskName());
            existing.setDescription(task.getDescription());
            return repo.save(existing);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}