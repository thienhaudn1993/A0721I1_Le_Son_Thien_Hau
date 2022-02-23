package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService{
    private static final Map<Integer, Customer> customers;

    static {

        customers = new HashMap<>();
        customers.put(1, new Customer(101, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(201, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(333, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(412, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(531, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(634, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
