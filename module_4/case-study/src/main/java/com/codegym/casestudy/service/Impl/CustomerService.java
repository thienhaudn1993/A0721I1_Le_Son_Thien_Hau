package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.repository.ICustomerRepository;
import com.codegym.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> searchCustomerByName(String name, Pageable pageable) {
        return customerRepository.searchCustomerByName(name, pageable);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
