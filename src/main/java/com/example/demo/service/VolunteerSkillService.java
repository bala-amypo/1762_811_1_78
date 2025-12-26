// package com.example.demo.service;

// import com.example.demo.model.VolunteerSkillRecord;
// import java.util.List;

// public interface VolunteerSkillService {
//     VolunteerSkillRecord save(VolunteerSkillRecord skill);
//     VolunteerSkillRecord getById(Long id);
//     List<VolunteerSkillRecord> getAll();
//     VolunteerSkillRecord update(Long id, VolunteerSkillRecord skill);
//     void delete(Long id);
// }
package com.example.demo.service;
import com.example.demo.model.VolunteerSkillRecord;
import java.util.List;
public interface VolunteerSkillService {
List<VolunteerSkillRecord> getSkillsByVolunteer(Long volunteerId);
VolunteerSkillRecord addOrUpdateSkill(VolunteerSkillRecord skill);
}