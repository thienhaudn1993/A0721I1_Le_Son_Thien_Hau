package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.CustomerType;
import com.codegym.casestudy.repository.ICustomerTypeRepository;
import com.codegym.casestudy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
