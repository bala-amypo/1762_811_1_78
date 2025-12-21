package com.example.demo.service.impl;

import com.example.demo.model.VolunteerSkillRecord;
import com.example.demo.repository.VolunteerSkillRecordRepository;
import com.example.demo.service.VolunteerSkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerSkillServiceImpl implements VolunteerSkillService {

    private final VolunteerSkillRecordRepository repo;

    public VolunteerSkillServiceImpl(VolunteerSkillRecordRepository repo) {
        this.repo = repo;
    }

    public VolunteerSkillRecord create(VolunteerSkillRecord skill) {
        return repo.save(skill);
    }

    public VolunteerSkillRecord getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<VolunteerSkillRecord> getAll() {
        return repo.findAll();
    }

    public VolunteerSkillRecord update(Long id, VolunteerSkillRecord skill) {
        VolunteerSkillRecord s = getById(id);
        s.setVolunteerId(skill.getVolunteerId());
        s.setSkillName(skill.getSkillName());
        s.setSkillLevel(skill.getSkillLevel());
        s.setCertified(skill.getCertified());
        return repo.save(s);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
