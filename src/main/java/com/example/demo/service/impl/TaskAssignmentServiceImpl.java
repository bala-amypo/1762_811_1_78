package com.example.demo.service.impl;

import com.example.demo.model.TaskAssignmentRecord;
import com.example.demo.repository.TaskAssignmentRecordRepository;
import com.example.demo.service.TaskAssignmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskAssignmentServiceImpl implements TaskAssignmentService {

    private final TaskAssignmentRecordRepository repo;

    public TaskAssignmentServiceImpl(TaskAssignmentRecordRepository repo) {
        this.repo = repo;
    }

    public TaskAssignmentRecord save(TaskAssignmentRecord record) {
        return repo.save(record);
    }

    public TaskAssignmentRecord getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<TaskAssignmentRecord> getAll() {
        return repo.findAll();
    }

    public TaskAssignmentRecord update(Long id, TaskAssignmentRecord r) {
        TaskAssignmentRecord e = getById(id);
        e.setStatus(r.getStatus());
        e.setNotes(r.getNotes());
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
