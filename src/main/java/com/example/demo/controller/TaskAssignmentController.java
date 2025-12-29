// package com.example.demo.controller;
// import com.example.demo.model.TaskAssignmentRecord;
// import com.example.demo.service.TaskAssignmentService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// @RestController
// @RequestMapping("/assignments")
// public class TaskAssignmentController {
// private final TaskAssignmentService assignmentService;
// public TaskAssignmentController(TaskAssignmentService assignmentService) {
// this.assignmentService = assignmentService;
// }
// @GetMapping("/task/{taskId}")
// public ResponseEntity<List<TaskAssignmentRecord>> getAssignmentsByTask(@PathVariable Long taskId) {
// List<TaskAssignmentRecord> assignments = assignmentService.getAssignmentsByTask(taskId);
// return ResponseEntity.ok(assignments);
// }
// @GetMapping("/volunteer/{volunteerId}")
// public ResponseEntity<List<TaskAssignmentRecord>> getAssignmentsByVolunteer(@PathVariable Long volunteerId) {
// List<TaskAssignmentRecord> assignments = assignmentService.getAssignmentsByVolunteer(volunteerId);
// return ResponseEntity.ok(assignments);
// }
// }


package com.example.demo.controller;

import com.example.demo.model.TaskAssignmentRecord;
import com.example.demo.service.TaskAssignmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
public class TaskAssignmentController {

    private final TaskAssignmentService service;

    public TaskAssignmentController(TaskAssignmentService service) {
        this.service = service;
    }

    @PostMapping
    public TaskAssignmentRecord create(@RequestBody TaskAssignmentRecord r) {
        return service.save(r);
    }

    @GetMapping("/{id}")
    public TaskAssignmentRecord get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<TaskAssignmentRecord> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public TaskAssignmentRecord update(@PathVariable Long id,
                                       @RequestBody TaskAssignmentRecord r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}