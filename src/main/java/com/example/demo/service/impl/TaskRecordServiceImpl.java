package com.example.demo.service.impl;

import com.example.demo.model.TaskRecord;
import com.example.demo.repository.TaskRecordRepository;
import com.example.demo.service.TaskRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ⭐⭐⭐ THIS IS MANDATORY
public class TaskRecordServiceImpl implements TaskRecordService {

    private final TaskRecordRepository repo;

    public TaskRecordServiceImpl(TaskRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public TaskRecord save(TaskRecord task) {
        return repo.save(task);
    }

    @Override
    public TaskRecord getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<TaskRecord> getAll() {
        return repo.findAll();
    }

    @Override
    public TaskRecord update(Long id, TaskRecord task) {
        TaskRecord existing = getById(id);
        existing.setTaskName(task.getTaskName());
        existing.setPriority(task.getPriority());
        existing.setStatus(task.getStatus());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
