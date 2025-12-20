package com.example.demo.controller;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.service.VolunteerProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@Tag(name = "Volunteer Profile CRUD API")
public class VolunteerProfileController {

    private final VolunteerProfileService volunteerProfileService;

    // Constructor Injection
    public VolunteerProfileController(VolunteerProfileService volunteerProfileService) {
        this.volunteerProfileService = volunteerProfileService;
    }

    // CREATE
    @PostMapping
    public VolunteerProfile createVolunteer(@RequestBody VolunteerProfile volunteer) {
        return volunteerProfileService.createVolunteer(volunteer);
    }

    // READ by ID
    @GetMapping("/{id}")
    public VolunteerProfile getVolunteerById(@PathVariable Long id) {
        return volunteerProfileService.getVolunteerById(id);
    }

    // READ all
    @GetMapping
    public List<VolunteerProfile> getAllVolunteers() {
        return volunteerProfileService.getAllVolunteers();
    }

    // UPDATE
    @PutMapping("/{id}")
    public VolunteerProfile updateVolunteer(@PathVariable Long id,
                                            @RequestBody VolunteerProfile volunteer) {
        return volunteerProfileService.updateVolunteer(id, volunteer);
    }

    // DELETE (with success message)
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVolunteer(@PathVariable Long id) {
        volunteerProfileService.deleteVolunteer(id);
        return ResponseEntity.ok("Volunteer deleted successfully");
    }
}
