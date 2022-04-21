package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Devision;
import com.codegym.casestudy.repository.IDevisionRepository;
import com.codegym.casestudy.service.IDevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevisionService implements IDevisionService {
    @Autowired
    IDevisionRepository devisionRepository;

    @Override
    public List<Devision> findAllDevision() {
        return devisionRepository.findAll();
    }
}
