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

    public VolunteerSkillRecord save(VolunteerSkillRecord skill) {
        return repo.save(skill);
    }

    public VolunteerSkillRecord getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<VolunteerSkillRecord> getAll() {
        return repo.findAll();
    }

    public VolunteerSkillRecord update(Long id, VolunteerSkillRecord skill) {
        VolunteerSkillRecord existing = getById(id);
        existing.setSkillName(skill.getSkillName());
        existing.setSkillLevel(skill.getSkillLevel());
        existing.setCertified(skill.getCertified());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}