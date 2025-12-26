// package com.example.demo.service;

// import com.example.demo.model.TaskAssignmentRecord;
// import java.util.List;

// public interface TaskAssignmentService {
//     TaskAssignmentRecord save(TaskAssignmentRecord record);
//     TaskAssignmentRecord getById(Long id);
//     List<TaskAssignmentRecord> getAll();
//     TaskAssignmentRecord update(Long id, TaskAssignmentRecord record);
//     void delete(Long id);
// }
package com.example.demo.service;
import com.example.demo.model.TaskAssignmentRecord;
import java.util.List;
public interface TaskAssignmentService {
TaskAssignmentRecord assignTask(Long taskId);
List<TaskAssignmentRecord> getAssignmentsByTask(Long taskId);
List<TaskAssignmentRecord> getAssignmentsByVolunteer(Long volunteerId);
List<TaskAssignmentRecord> getAllAssignments();
}