package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Service;

import java.util.List;

public interface IServiceOfService {
    List<Service> findAllService();
    void saveService(Service service);
    Service findByServiceId(Long id);
}
