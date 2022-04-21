package com.codegym.managercustomer.service;


import com.codegym.managercustomer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer findCustomerById(Long id);
}
