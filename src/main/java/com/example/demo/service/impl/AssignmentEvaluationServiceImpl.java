package com.example.demo.service.impl;

import com.example.demo.model.AssignmentEvaluationRecord;
import com.example.demo.repository.AssignmentEvaluationRecordRepository;
import com.example.demo.service.AssignmentEvaluationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentEvaluationServiceImpl implements AssignmentEvaluationService {

    private final AssignmentEvaluationRecordRepository repo;

    public AssignmentEvaluationServiceImpl(AssignmentEvaluationRecordRepository repo) {
        this.repo = repo;
    }

    public AssignmentEvaluationRecord save(AssignmentEvaluationRecord record) {
        return repo.save(record);
    }

    public AssignmentEvaluationRecord getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<AssignmentEvaluationRecord> getAll() {
        return repo.findAll();
    }

    public AssignmentEvaluationRecord update(Long id, AssignmentEvaluationRecord r) {
        AssignmentEvaluationRecord e = getById(id);
        e.setRating(r.getRating());
        e.setFeedback(r.getFeedback());
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}