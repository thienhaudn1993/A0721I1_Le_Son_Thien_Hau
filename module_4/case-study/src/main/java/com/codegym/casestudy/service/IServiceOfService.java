package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IServiceOfService {
    List<Service> findAllService();

    void saveService(Service service);

    Service findByServiceId(Long id);

    Page<Service> findAllService(Pageable pageable);
}
