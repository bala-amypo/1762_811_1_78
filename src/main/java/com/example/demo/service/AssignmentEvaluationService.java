// package com.example.demo.service;

// import com.example.demo.model.AssignmentEvaluationRecord;
// import java.util.List;

// public interface AssignmentEvaluationService {
//     AssignmentEvaluationRecord save(AssignmentEvaluationRecord record);
//     AssignmentEvaluationRecord getById(Long id);
//     List<AssignmentEvaluationRecord> getAll();
//     AssignmentEvaluationRecord update(Long id, AssignmentEvaluationRecord record);
//     void delete(Long id);
// }
AssignmentEvaluationService.java
package com.example.demo.service;
import com.example.demo.model.AssignmentEvaluationRecord;
import java.util.List;
public interface AssignmentEvaluationService {
AssignmentEvaluationRecord evaluateAssignment(AssignmentEvaluationRecord evaluation);
List<AssignmentEvaluationRecord> getEvaluationsByAssignment(Long assignmentId);
}