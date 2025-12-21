package com.example.demo.service.impl;

import com.example.demo.model.TaskRecord;
import com.example.demo.repository.TaskRecordRepository;
import com.example.demo.service.TaskRecordService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskRecordServiceImpl implements TaskRecordService {

    private final TaskRecordRepository repo;

    public TaskRecordServiceImpl(TaskRecordRepository repo) {
        this.repo = repo;
    }

    public TaskRecord save(TaskRecord task) {
        return repo.save(task);
    }

    public TaskRecord getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<TaskRecord> getAll() {
        return repo.findAll();
    }

    public TaskRecord update(Long id, TaskRecord task) {
        TaskRecord existing = getById(id);
        existing.setTaskName(task.getTaskName());
        existing.setPriority(task.getPriority());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
