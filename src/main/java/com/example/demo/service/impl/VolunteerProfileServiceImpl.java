package com.example.demo.service.impl;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.repository.VolunteerProfileRepository;
import com.example.demo.service.VolunteerProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerProfileServiceImpl implements VolunteerProfileService {

    private final VolunteerProfileRepository repo;

    public VolunteerProfileServiceImpl(VolunteerProfileRepository repo) {
        this.repo = repo;
    }

    public VolunteerProfile save(VolunteerProfile volunteer) {
        return repo.save(volunteer);
    }

    public VolunteerProfile getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<VolunteerProfile> getAll() {
        return repo.findAll();
    }

    public VolunteerProfile update(Long id, VolunteerProfile v) {
        VolunteerProfile e = getById(id);
        e.setVolunteerId(v.getVolunteerId());
        e.setFullName(v.getFullName());
        e.setEmail(v.getEmail());
        e.setPhone(v.getPhone());
        e.setAvailabilityStatus(v.getAvailabilityStatus());
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
