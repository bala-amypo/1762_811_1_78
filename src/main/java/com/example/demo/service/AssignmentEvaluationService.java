package com.example.demo.service; 
 
import com.example.demo.model.AssignmentEvaluationRecord; 
import java.util.List; 
 
public interface AssignmentEvaluationService { 
    AssignmentEvaluationRecord evaluateAssignment(AssignmentEvaluationRecord evaluation); 
    List<AssignmentEvaluationRecord> getEvaluationsByAssignment(Long assignmentId); 
} 
TaskAssignmentService.java 
package com.example.demo.service; 
 
import com.example.demo.model.TaskAssignmentRecord; 
import java.util.List; 
public interface TaskAssignmentService { 
TaskAssignmentRecord assignTask(Long taskId); 
List<TaskAssignmentRecord> getAssignmentsByTask(Long taskId); 
List<TaskAssignmentRecord> getAssignmentsByVolunteer(Long volunteerId); 
List<TaskAssignmentRecord> getAllAssignments(); 
}