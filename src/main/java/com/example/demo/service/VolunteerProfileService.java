package com.example.demo.service;

import com.example.demo.model.VolunteerProfile;
import java.util.List;

public interface VolunteerProfileService {
    VolunteerProfile save(VolunteerProfile volunteer);
    VolunteerProfile getById(Long id);
    List<VolunteerProfile> getAll();
    VolunteerProfile update(Long id, VolunteerProfile volunteer);
    void delete(Long id);
}

