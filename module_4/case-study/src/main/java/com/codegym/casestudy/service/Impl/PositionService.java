package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Position;
import com.codegym.casestudy.repository.IPositionRepository;
import com.codegym.casestudy.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionRepository positionRepository;

    @Override
    public List<Position> findAllPosition() {
        return positionRepository.findAll();
    }
}
