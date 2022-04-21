package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.ServiceType;
import com.codegym.casestudy.repository.IServiceTypeRepository;
import com.codegym.casestudy.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    IServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAllServiceType() {
        return serviceTypeRepository.findAll();
    }
}
