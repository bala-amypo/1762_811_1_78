package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.entity.TaskAssignmentEntity;
import com.example.demo.service.TaskAssignmentService;

@RestController
@RequestMapping("/task")
public class TaskAssignmentController {

    @Autowired
    private TaskAssignmentService service;

    @PostMapping
    public TaskAssignmentEntity create(@RequestBody TaskAssignmentEntity task) {
        return service.create(task);
    }

    @GetMapping
    public List<TaskAssignmentEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TaskAssignmentEntity getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public TaskAssignmentEntity update(@PathVariable Long id,
                                       @RequestBody TaskAssignmentEntity task) {
        return service.update(id, task);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Task assignment deleted successfully";
    }
}