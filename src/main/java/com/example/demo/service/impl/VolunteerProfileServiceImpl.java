package com.example.demo.service.impl;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.repository.VolunteerProfileRepository;
import com.example.demo.service.VolunteerProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerProfileServiceImpl implements VolunteerProfileService {

    private final VolunteerProfileRepository volunteerProfileRepository;

    public VolunteerProfileServiceImpl(VolunteerProfileRepository volunteerProfileRepository) {
        this.volunteerProfileRepository = volunteerProfileRepository;
    }

    @Override
    public VolunteerProfile createVolunteer(VolunteerProfile volunteer) {
        return volunteerProfileRepository.save(volunteer);
    }

    @Override
    public VolunteerProfile getVolunteerById(Long id) {
        return volunteerProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Volunteer not found"));
    }

    @Override
    public List<VolunteerProfile> getAllVolunteers() {
        return volunteerProfileRepository.findAll();
    }

    @Override
    public VolunteerProfile updateVolunteer(Long id, VolunteerProfile updatedVolunteer) {
        VolunteerProfile existing = getVolunteerById(id);

        existing.setVolunteerId(updatedVolunteer.getVolunteerId());
        existing.setFullName(updatedVolunteer.getFullName());
        existing.setEmail(updatedVolunteer.getEmail());
        existing.setPhone(updatedVolunteer.getPhone());
        existing.setAvailabilityStatus(updatedVolunteer.getAvailabilityStatus());

        return volunteerProfileRepository.save(existing);
    }

    @Override
    public void deleteVolunteer(Long id) {
        volunteerProfileRepository.deleteById(id);
    }
}
