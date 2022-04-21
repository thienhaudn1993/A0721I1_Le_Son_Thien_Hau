package com.codegym.managercustomer.service.Impl;

import com.codegym.managercustomer.model.Customer;
import com.codegym.managercustomer.repository.CustomerRepository;
import com.codegym.managercustomer.service.CustomerSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSeriveImpl implements CustomerSerive {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
}
