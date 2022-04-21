package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findCustomerById(Long id);

    void save(Customer customer);

    void deleteCustomerById(Long id);

    Page<Customer> searchCustomerByName(String name, Pageable pageable);

    List<Customer> findAll();


}