package com.codegym.repository;

import com.codegym.model.HealthDeclaration;

public interface HealthRepository {
    void save(HealthDeclaration healthDeclaration);
}
