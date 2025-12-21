package com.example.demo.service;

import com.example.demo.model.TaskRecord;
import java.util.List;

public interface TaskRecordService {
    TaskRecord save(TaskRecord task);
    TaskRecord getById(Long id);
    List<TaskRecord> getAll();
    TaskRecord update(Long id, TaskRecord task);
    void delete(Long id);
}
