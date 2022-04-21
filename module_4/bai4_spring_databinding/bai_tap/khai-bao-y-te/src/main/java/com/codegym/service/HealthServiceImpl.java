package com.codegym.service;

import com.codegym.model.HealthDeclaration;
import com.codegym.repository.HealthRepository;
import com.codegym.repository.HealthRepositoryImpl;

public class HealthServiceImpl implements HealthService {
    private HealthRepository healthRepository = new HealthRepositoryImpl();

    @Override
    public void save(HealthDeclaration healthDeclaration) {
        healthRepository.save(healthDeclaration);
    }
}
