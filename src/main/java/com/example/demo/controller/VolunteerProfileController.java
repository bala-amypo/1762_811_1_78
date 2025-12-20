// package com.example.demo.controller;

// import com.example.demo.model.VolunteerProfile;
// import com.example.demo.service.VolunteerProfileService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/volunteers")
// @Tag(name = "Volunteer Profile CRUD API")
// public class VolunteerProfileController {

//     private final VolunteerProfileService volunteerProfileService;

//     // Constructor Injection
//     public VolunteerProfileController(VolunteerProfileService volunteerProfileService) {
//         this.volunteerProfileService = volunteerProfileService;
//     }

//     // CREATE
//     @PostMapping
//     public VolunteerProfile createVolunteer(@RequestBody VolunteerProfile volunteer) {
//         return volunteerProfileService.createVolunteer(volunteer);
//     }

//     // READ by ID
//     @GetMapping("/{id}")
//     public VolunteerProfile getVolunteerById(@PathVariable Long id) {
//         return volunteerProfileService.getVolunteerById(id);
//     }

//     // READ all
//     @GetMapping
//     public List<VolunteerProfile> getAllVolunteers() {
//         return volunteerProfileService.getAllVolunteers();
//     }

//     // UPDATE
//     @PutMapping("/{id}")
//     public VolunteerProfile updateVolunteer(@PathVariable Long id,
//                                             @RequestBody VolunteerProfile volunteer) {
//         return volunteerProfileService.updateVolunteer(id, volunteer);
//     }

//     // DELETE (with success message)
//     @DeleteMapping("/{id}")
//     public ResponseEntity<String> deleteVolunteer(@PathVariable Long id) {
//         volunteerProfileService.deleteVolunteer(id);
//         return ResponseEntity.ok("Volunteer deleted successfully");
//     }
// }


package com.example.demo.controller;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.service.VolunteerProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteers")
public class VolunteerProfileController {

    private final VolunteerProfileService volunteerService;

    public VolunteerProfileController(VolunteerProfileService volunteerService) {
        this.volunteerService = volunteerService;
    }

    // Create volunteer
    @PostMapping
    public ResponseEntity<VolunteerProfile> createVolunteer(@RequestBody VolunteerProfile volunteer) {
        VolunteerProfile created = volunteerService.createVolunteer(volunteer);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // Get volunteer by ID
    @GetMapping("/{id}")
    public ResponseEntity<VolunteerProfile> getVolunteer(@PathVariable Long id) {
        VolunteerProfile volunteer = volunteerService.getVolunteerById(id);
        return ResponseEntity.ok(volunteer);
    }

    // Get all volunteers
    @GetMapping
    public ResponseEntity<List<VolunteerProfile>> getAllVolunteers() {
        List<VolunteerProfile> volunteers = volunteerService.getAllVolunteers();
        return ResponseEntity.ok(volunteers);
    }

    // Update volunteer
    @PutMapping("/{id}")
    public ResponseEntity<VolunteerProfile> updateVolunteer(@PathVariable Long id,
                                                            @RequestBody VolunteerProfile volunteer) {
        VolunteerProfile updated = volunteerService.updateVolunteer(id, volunteer);
        return ResponseEntity.ok(updated);
    }

    // Delete volunteer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVolunteer(@PathVariable Long id) {
        volunteerService.deleteVolunteer(id);
        return ResponseEntity.noContent().build();
    }
}
