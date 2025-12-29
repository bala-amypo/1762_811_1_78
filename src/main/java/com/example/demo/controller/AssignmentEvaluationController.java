// package com.example.demo.controller;
// import com.example.demo.dto.EvaluationRequest;
// import com.example.demo.model.AssignmentEvaluationRecord;
// import com.example.demo.service.AssignmentEvaluationService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// @RestController
// @RequestMapping("/evaluations")
// public class AssignmentEvaluationController {
// private final AssignmentEvaluationService evaluationService;
// public AssignmentEvaluationController(AssignmentEvaluationService evaluationService) {
// this.evaluationService = evaluationService;
// }
// @PostMapping
// public ResponseEntity<AssignmentEvaluationRecord> evaluateAssignment(@RequestBody EvaluationRequest request) {
// AssignmentEvaluationRecord evaluation = new AssignmentEvaluationRecord(
// request.getAssignmentId(),
// request.getRating(),
// request.getComments()
// );
// AssignmentEvaluationRecord result = evaluationService.evaluateAssignment(evaluation);
// return ResponseEntity.ok(result);
// }
// }

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
