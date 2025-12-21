package com.example.demo.controller;

import com.example.demo.model.AssignmentEvaluationRecord;
import com.example.demo.service.AssignmentEvaluationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
public class AssignmentEvaluationController {

    private final AssignmentEvaluationService service;

    public AssignmentEvaluationController(AssignmentEvaluationService service) {
        this.service = service;
    }

    @PostMapping
    public AssignmentEvaluationRecord create(@RequestBody AssignmentEvaluationRecord r) {
        return service.save(r);
    }

    @GetMapping("/{id}")
    public AssignmentEvaluationRecord get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<AssignmentEvaluationRecord> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public AssignmentEvaluationRecord update(@PathVariable Long id,
                                             @RequestBody AssignmentEvaluationRecord r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}
