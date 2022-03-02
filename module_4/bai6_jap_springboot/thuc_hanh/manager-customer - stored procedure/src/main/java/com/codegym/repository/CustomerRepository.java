package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
    boolean insertWithStoredProcedure(Customer customer);
}
