// package com.example.demo.controller;

// import com.example.demo.model.VolunteerSkillRecord;
// import com.example.demo.service.VolunteerSkillService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/skills")
// public class VolunteerSkillController {

//     private final VolunteerSkillService service;

//     public VolunteerSkillController(VolunteerSkillService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public VolunteerSkillRecord create(@RequestBody VolunteerSkillRecord skill) {
//         return service.save(skill);
//     }

//     @GetMapping("/{id}")
//     public VolunteerSkillRecord get(@PathVariable Long id) {
//         return service.getById(id);
//     }

//     @GetMapping
//     public List<VolunteerSkillRecord> getAll() {
//         return service.getAll();
//     }

//     @PutMapping("/{id}")
//     public VolunteerSkillRecord update(@PathVariable Long id,
//                                        @RequestBody VolunteerSkillRecord skill) {
//         return service.update(id, skill);
//     }

//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         service.delete(id);
//         return "Deleted successfully";
//     }
// }