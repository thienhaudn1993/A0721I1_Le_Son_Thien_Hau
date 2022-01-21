package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();


    Customer findById(String id);

    void save(String id, String name, String email, String address);

    boolean createCustomer(Customer customer);

    boolean remove(String id);

    Customer findByName(String Name);

}
