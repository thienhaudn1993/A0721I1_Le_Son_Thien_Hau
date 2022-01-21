package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(String id);

    void save(String id, String name, String email, String address);

    void createCustomer(Customer customer);

    void remove(String id);
}
