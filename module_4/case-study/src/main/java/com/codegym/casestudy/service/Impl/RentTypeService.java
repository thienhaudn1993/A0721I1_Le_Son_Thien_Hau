package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.RentType;
import com.codegym.casestudy.repository.IRentTypeRepository;
import com.codegym.casestudy.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAllRentType() {
        return rentTypeRepository.findAll();
    }
}
