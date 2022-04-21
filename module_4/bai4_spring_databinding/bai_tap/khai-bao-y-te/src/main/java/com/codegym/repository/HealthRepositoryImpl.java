package com.codegym.repository;

import com.codegym.model.HealthDeclaration;

import java.util.ArrayList;
import java.util.List;

public class HealthRepositoryImpl implements HealthRepository {
    List<HealthDeclaration> lists = new ArrayList<>();

    @Override
    public void save(HealthDeclaration healthDeclaration) {
        lists.add(healthDeclaration);
    }
}
