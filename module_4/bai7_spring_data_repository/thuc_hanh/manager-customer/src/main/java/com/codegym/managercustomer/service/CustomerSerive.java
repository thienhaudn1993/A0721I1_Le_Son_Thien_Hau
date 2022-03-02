package com.codegym.managercustomer.service;

import com.codegym.managercustomer.model.Customer;

import java.util.List;

public interface CustomerSerive {
    List<Customer> findAll();

    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer findCustomerById(Long id);
}
