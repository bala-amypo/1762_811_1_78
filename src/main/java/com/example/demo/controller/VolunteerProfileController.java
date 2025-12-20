package com.example.demo.controller;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.service.VolunteerProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@Tag(name = "Volunteer Profile CRUD API")
public class VolunteerProfileController {

    private final VolunteerProfileService volunteerProfileService;

    public VolunteerProfileController(VolunteerProfileService volunteerProfileService) {
        this.volunteerProfileService = volunteerProfileService;
    }

    @PostMapping
    public VolunteerProfile createVolunteer(@RequestBody VolunteerProfile volunteer) {
        return volunteerProfileService.createVolunteer(volunteer);
    }

    @GetMapping("/{id}")
    public VolunteerProfile getVolunteerById(@PathVariable Long id) {
        return volunteerProfileService.getVolunteerById(id);
    }

    @GetMapping
    public List<VolunteerProfile> getAllVolunteers() {
        return volunteerProfileService.getAllVolunteers();
    }

    @PutMapping("/{id}")
    public VolunteerProfile updateVolunteer(@PathVariable Long id,
                                            @RequestBody VolunteerProfile volunteer) {
        return volunteerProfileService.updateVolunteer(id, volunteer);
    }

    @DeleteMapping("/{id}")
    public void deleteVolunteer(@PathVariable Long id) {
        volunteerProfileService.deleteVolunteer(id);
    }
}
