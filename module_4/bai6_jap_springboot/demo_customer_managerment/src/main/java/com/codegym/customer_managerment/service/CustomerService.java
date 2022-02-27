package com.codegym.customer_managerment.service;

import com.codegym.customer_managerment.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void saveCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer findCustomerById(Long id);
}
