package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.EducationDegree;
import com.codegym.casestudy.repository.IEducationDegreeRepository;
import com.codegym.casestudy.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationDegreeService {
    @Autowired
    IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
