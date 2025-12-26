// package com.example.demo.service;

// import com.example.demo.model.TaskRecord;
// import java.util.List;

// public interface TaskRecordService {

//     TaskRecord save(TaskRecord task);
//     TaskRecord getById(Long id);
//     List<TaskRecord> getAll();
//     TaskRecord update(Long id, TaskRecord task);
//     void delete(Long id);
// }
package com.example.demo.service;
import com.example.demo.model.TaskRecord;
import java.util.List;
import java.util.Optional;
public interface TaskRecordService {
TaskRecord createTask(TaskRecord task);
TaskRecord getTaskById(Long id);
TaskRecord updateTask(Long id, TaskRecord task);
List<TaskRecord> getOpenTasks();
Optional<TaskRecord> getTaskByCode(String taskCode);
List<TaskRecord> getAllTasks();
}