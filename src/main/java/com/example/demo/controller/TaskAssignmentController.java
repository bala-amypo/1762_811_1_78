package com.example.demo.controller;

import com.example.demo.model.TaskAssignmentRecord;
import com.example.demo.service.TaskAssignmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
@Tag(name = "Task Assignments")
public class TaskAssignmentController {

    private final TaskAssignmentService taskAssignmentService;

    public TaskAssignmentController(TaskAssignmentService taskAssignmentService) {
        this.taskAssignmentService = taskAssignmentService;
    }

    @Operation(summary = "Assign task automatically")
    @PostMapping("/assign/{taskId}")
    public TaskAssignmentRecord assignTask(@PathVariable Long taskId) {
        return taskAssignmentService.assignTask(taskId);
    }

    @Operation(summary = "Update assignment status")
    @PutMapping("/{id}/status")
    public TaskAssignmentRecord updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return taskAssignmentService.updateAssignmentStatus(id, status);
    }

    @Operation(summary = "Get assignments by volunteer")
    @GetMapping("/volunteer/{volunteerId}")
    public List<TaskAssignmentRecord> getByVolunteer(@PathVariable Long volunteerId) {
        return taskAssignmentService.getAssignmentsByVolunteer(volunteerId);
    }

    @Operation(summary = "Get assignments by task")
    @GetMapping("/task/{taskId}")
    public List<TaskAssignmentRecord> getByTask(@PathVariable Long taskId) {
        return taskAssignmentService.getAssignmentsByTask(taskId);
    }

    @Operation(summary = "Get all assignments")
    @GetMapping
    public List<TaskAssignmentRecord> getAllAssignments() {
        return taskAssignmentService.getAllAssignments();
    }
}
