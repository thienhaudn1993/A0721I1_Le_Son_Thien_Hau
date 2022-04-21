package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Service;
import com.codegym.casestudy.repository.IServiceOfRepository;
import com.codegym.casestudy.service.IServiceOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

@org.springframework.stereotype.Service
public class ServiceOfCustomerService implements IServiceOfService {
    @Autowired
    IServiceOfRepository serviceOfRepository;

    @Override
    public List<Service> findAllService() {
        return serviceOfRepository.findAll();
    }

    @Override
    public void saveService(Service service) {
        serviceOfRepository.save(service);
    }

    @Override
    public Service findByServiceId(Long id) {
        return serviceOfRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Service> findAllService(Pageable pageable) {
        return serviceOfRepository.findAll(pageable);
    }
}
