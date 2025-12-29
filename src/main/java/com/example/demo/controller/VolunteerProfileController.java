// package com.example.demo.controller;
// import com.example.demo.dto.AvailabilityUpdateRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.model.VolunteerProfile;
// import com.example.demo.service.VolunteerProfileService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// @RestController
// @RequestMapping("/volunteers")
// public class VolunteerProfileController {
// private final VolunteerProfileService volunteerService;
// public VolunteerProfileController(VolunteerProfileService volunteerService) {
// this.volunteerService = volunteerService;
// }
// @PostMapping
// public ResponseEntity<VolunteerProfile> registerVolunteer(@RequestBody RegisterRequest request) {
// VolunteerProfile profile = volunteerService.registerVolunteer(request);
// return ResponseEntity.ok(profile);
// }
// @PatchMapping("/{id}/availability")
// public ResponseEntity<VolunteerProfile> updateAvailability(@PathVariable Long id,
// @RequestBody AvailabilityUpdateRequest request) {
// VolunteerProfile profile = volunteerService.updateAvailability(id, request.getAvailabilityStatus());
// return ResponseEntity.ok(profile);
// }
// }


package com.example.demo.controller;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.service.VolunteerProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteers")
public class VolunteerProfileController {

    private final VolunteerProfileService service;

    public VolunteerProfileController(VolunteerProfileService service) {
        this.service = service;
    }

    @PostMapping
    public VolunteerProfile create(@RequestBody VolunteerProfile v) {
        return service.save(v);
    }

    @GetMapping("/{id}")
    public VolunteerProfile get(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<VolunteerProfile> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public VolunteerProfile update(@PathVariable Long id, @RequestBody VolunteerProfile v) {
        return service.update(id, v);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}